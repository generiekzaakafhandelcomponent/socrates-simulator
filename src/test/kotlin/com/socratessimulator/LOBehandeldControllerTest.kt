package com.socratessimulator

import org.hamcrest.Matchers.containsString
import org.hamcrest.Matchers.hasItem
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultActions
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class LOBehandeldControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    private fun buildRequest(
        bsn: String,
        aanvragerExtra: String = "",
        loBehandeldExtra: String = """,
                "RedenAanvraagLevensonderhoud": {
                    "OnvoldoendeInkomen": "1"
                }"""
    ) = """
        {
            "Identificatie": "Z-123",
            "LObehandeld": {
                "Aanvraagdatum": "2023-01-01",
                "Aanvraagid": "550e8400-e29b-41d4-a716-446655440000",
                "CodeOntvangendeGemeente": "0307",
                "Huishouding": {
                    "Aanvrager": {
                        "Burgerservicenummer": "$bsn"$aanvragerExtra
                    },
                    "Leefsituatie": "3"
                },
                "IngangBijstandsuitkering": {
                    "DatumMeldingBijGemeente": "2023-01-01"
                }$loBehandeldExtra
            }
        }
    """.trimIndent()

    private fun send(body: String): ResultActions = mockMvc.perform(
        post("/api/v2/LOBehandeld")
            .contentType(MediaType.APPLICATION_JSON)
            .content(body)
    )

    @Test
    fun `valid minimal request returns 200`() {
        send(buildRequest("123456782"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
            .andExpect(jsonPath("$.responseId").isNotEmpty)
    }

    @Test
    fun `RedenAanvraagLevensonderhoud is optional in v2`() {
        send(buildRequest("123456782", loBehandeldExtra = ""))
            .andExpect(status().isOk)
    }

    @Test
    fun `full request with polymorphic Adres, Bekostiger and Inkomsten types returns 200`() {
        val aanvrager = """,
                        "Adreshouding": [{
                            "Adres": {
                                "SoortAdres": "1",
                                "Straatnaam": "Coolsingel",
                                "Huisnummer": 40,
                                "Postcode": "3011 AD",
                                "Woonplaatsnaam": "Rotterdam"
                            },
                            "CodeFunctieAdres": "C",
                            "Begindatum": "2023-01-01"
                        }],
                        "Partner": {
                            "PartnerRelatietype": "1"
                        },
                        "Kinderen": [{
                            "Kind": { "Burgerservicenummer": "111222333" },
                            "OuderKindRelatietype": "OK",
                            "IndicatieCoOuder": "2",
                            "IndicatieKinderbijslag": "1",
                            "IndicatieOnderhoudsplicht": "1",
                            "IndicatieThuiswonend": "1"
                        }],
                        "Medebewoners": [{
                            "Bewoner": { "Burgerservicenummer": "123456782" },
                            "IndicatieKostendeler": "1",
                            "Relatietype": "3",
                            "IngangsdatumRelatie": "2020-01-01"
                        }],
                        "Profiel": {
                            "Inkomstenverhoudingen": [
                                {
                                    "Bekostiger": {
                                        "SoortBekostiger": "1",
                                        "Loonheffingsnummer": "123456789L01",
                                        "Naam": "Werkgever BV"
                                    },
                                    "PeriodeStartdatum": "2022-01-01",
                                    "PrimairInkomstencomponent": {
                                        "BrutoNetto": "Br",
                                        "PeriodeStartdatum": "2022-01-01",
                                        "PrimairInkomstencomponenttype": "3",
                                        "Inkomsten": "1500,00",
                                        "InkomstencomponenttypeSpecifiekeGegevens": {
                                            "SoortInkomstencomponenttypeSpecifiekeGegevens": "1",
                                            "IndicatieLoonheffingskorting": "1",
                                            "IndicatieReserveringVT": "2"
                                        }
                                    }
                                },
                                {
                                    "Bekostiger": {
                                        "SoortBekostiger": "2",
                                        "Burgerservicenummer": "111222333"
                                    },
                                    "PeriodeStartdatum": "2022-01-01",
                                    "PrimairInkomstencomponent": {
                                        "BrutoNetto": "Nt",
                                        "PeriodeStartdatum": "2022-01-01",
                                        "PrimairInkomstencomponenttype": "1",
                                        "InkomstencomponenttypeSpecifiekeGegevens": {
                                            "SoortInkomstencomponenttypeSpecifiekeGegevens": "3",
                                            "InkomstensoortAlimentatie": "1"
                                        }
                                    }
                                }
                            ]
                        }"""

        send(buildRequest("123456782", aanvragerExtra = aanvrager))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
    }

    @Test
    fun `Partner with relatietype 4 requires IngangsdatumRelatie`() {
        val partner = """,
                        "Partner": { "PartnerRelatietype": "4" }"""

        send(buildRequest("123456782", aanvragerExtra = partner))
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("VALIDATION_ERROR"))
            .andExpect(jsonPath("$.fouten", hasItem(containsString("IngangsdatumRelatie"))))
    }

    @Test
    fun `Partner with relatietype 4 and IngangsdatumRelatie returns 200`() {
        val partner = """,
                        "Partner": { "PartnerRelatietype": "4", "IngangsdatumRelatie": "2020-05-01" }"""

        send(buildRequest("123456782", aanvragerExtra = partner))
            .andExpect(status().isOk)
    }

    @Test
    fun `removed CodeFunctieAdres value W is rejected`() {
        val adres = """,
                        "Adreshouding": [{
                            "Adres": {
                                "SoortAdres": "2",
                                "Postbusnummer": 100,
                                "Postcode": "3000 AA",
                                "Woonplaatsnaam": "Rotterdam"
                            },
                            "CodeFunctieAdres": "W",
                            "Begindatum": "2023-01-01"
                        }]"""

        send(buildRequest("123456782", aanvragerExtra = adres))
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("MALFORMED_JSON"))
    }

    @Test
    fun `BSN 999999400 returns HTTP 400`() {
        send(buildRequest("999999400"))
            .andExpect(status().isBadRequest)
            .andExpect(jsonPath("$.foutcode").value("TEST_400"))
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
    }

    @Test
    fun `BSN 999999424 returns HTTP 422`() {
        send(buildRequest("999999424"))
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("TEST_422"))
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
    }

    @Test
    fun `BSN 999999503 returns HTTP 500`() {
        send(buildRequest("999999503"))
            .andExpect(status().isInternalServerError)
            .andExpect(jsonPath("$.foutcode").value("TEST_500"))
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
    }

    @Test
    fun `missing LObehandeld returns malformed request`() {
        send("""{ "Identificatie": "Z-123" }""")
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("MALFORMED_JSON"))
            .andExpect(jsonPath("$.details", containsString("LObehandeld")))
    }

    @Test
    fun `v1 camelCase payload is rejected`() {
        send("""{ "identificatie": "Z-123", "loBehandeld": {} }""")
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("MALFORMED_JSON"))
    }

    @Test
    fun `validation error - BSN too short`() {
        send(buildRequest("123"))
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("VALIDATION_ERROR"))
            .andExpect(jsonPath("$.fouten").isArray)
            .andExpect(jsonPath("$.fouten", hasItem(containsString("burgerservicenummer"))))
    }

    @Test
    fun `validation error - BSN fails elfproef`() {
        send(buildRequest("123456789"))
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("VALIDATION_ERROR"))
            .andExpect(jsonPath("$.fouten", hasItem(containsString("burgerservicenummer"))))
    }
}
