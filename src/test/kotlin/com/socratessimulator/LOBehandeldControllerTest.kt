package com.socratessimulator

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.hamcrest.Matchers.containsString
import org.hamcrest.Matchers.hasItem

@SpringBootTest
@AutoConfigureMockMvc
class LOBehandeldControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    private fun buildRequest(bsn: String) = """
        {
            "identificatie": "Z-123",
            "loBehandeld": {
                "aanvraagdatum": "2023-01-01",
                "aanvraagid": "550e8400-e29b-41d4-a716-446655440000",
                "codeOntvangendeGemeente": "0307",
                "huishouding": {
                    "aanvrager": {
                        "burgerservicenummer": "$bsn",
                        "geboortedatum": "1980-01-01",
                        "geslachtsaanduiding": "1",
                        "geslachtsnaamstam": "Jansen",
                        "voorlettersAanschrijving": "J.",
                        "naamgebruik": "1",
                        "codeBrpGegevensGeheim": "0",
                        "nationaliteit": ["0"]
                    },
                    "leefsituatie": "3"
                },
                "ingangBijstandsuitkering": {
                    "datumMeldingBijGemeente": "2023-01-01",
                    "datumIngang": "2023-01-01"
                },
                "redenAanvraagLevensonderhoud": {
                    "onvoldoendeInkomen": "1"
                }
            }
        }
    """.trimIndent()

    @Test
    fun `test LOBehandeld endpoint - valid request`() {
        mockMvc.perform(
            post("/api/v1/LOBehandeld")
                .contentType(MediaType.APPLICATION_JSON)
                .content(buildRequest("123456782"))
        )
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
            .andExpect(jsonPath("$.responseId").isNotEmpty)
    }

    @Test
    fun `test BSN 999999400 returns HTTP 400`() {
        mockMvc.perform(
            post("/api/v1/LOBehandeld")
                .contentType(MediaType.APPLICATION_JSON)
                .content(buildRequest("999999400"))
        )
            .andExpect(status().isBadRequest)
            .andExpect(jsonPath("$.foutcode").value("TEST_400"))
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
    }

    @Test
    fun `test BSN 999999424 returns HTTP 422`() {
        mockMvc.perform(
            post("/api/v1/LOBehandeld")
                .contentType(MediaType.APPLICATION_JSON)
                .content(buildRequest("999999424"))
        )
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("TEST_422"))
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
    }

    @Test
    fun `test BSN 999999503 returns HTTP 500`() {
        mockMvc.perform(
            post("/api/v1/LOBehandeld")
                .contentType(MediaType.APPLICATION_JSON)
                .content(buildRequest("999999503"))
        )
            .andExpect(status().isInternalServerError)
            .andExpect(jsonPath("$.foutcode").value("TEST_500"))
            .andExpect(jsonPath("$.berichtId").value("Z-123"))
    }

    @Test
    fun `test LOBehandeld endpoint - malformed request`() {
        val jsonRequest = """
            {
                "identificatie": "Z-123"
            }
        """.trimIndent()

        mockMvc.perform(
            post("/api/v1/LOBehandeld")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonRequest)
        )
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("MALFORMED_JSON"))
            .andExpect(jsonPath("$.details", containsString("loBehandeld")))
    }

    @Test
    fun `test LOBehandeld endpoint - validation error - BSN too short`() {
        val jsonRequest = """
            {
                "identificatie": "Z-123",
                "loBehandeld": {
                    "aanvraagdatum": "2023-01-01",
                    "aanvraagid": "550e8400-e29b-41d4-a716-446655440000",
                    "codeOntvangendeGemeente": "0307",
                    "huishouding": {
                        "aanvrager": {
                            "burgerservicenummer": "123",
                            "geboortedatum": "1980-01-01",
                            "geslachtsaanduiding": "1",
                            "geslachtsnaamstam": "Jansen",
                            "voorlettersAanschrijving": "J.",
                            "naamgebruik": "1",
                            "codeBrpGegevensGeheim": "0",
                            "nationaliteit": ["0"]
                        },
                        "leefsituatie": "3"
                    },
                    "ingangBijstandsuitkering": {
                        "datumMeldingBijGemeente": "2023-01-01",
                        "datumIngang": "2023-01-01"
                    },
                    "redenAanvraagLevensonderhoud": {
                        "onvoldoendeInkomen": "1"
                    }
                }
            }
        """.trimIndent()

        mockMvc.perform(
            post("/api/v1/LOBehandeld")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonRequest)
        )
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("VALIDATION_ERROR"))
            .andExpect(jsonPath("$.fouten").isArray)
            .andExpect(jsonPath("$.fouten", hasItem(containsString("burgerservicenummer"))))
    }

    @Test
    fun `test LOBehandeld endpoint - validation error - BSN fails elfproef`() {
        val jsonRequest = """
            {
                "identificatie": "Z-123",
                "loBehandeld": {
                    "aanvraagdatum": "2023-01-01",
                    "aanvraagid": "550e8400-e29b-41d4-a716-446655440000",
                    "codeOntvangendeGemeente": "0307",
                    "huishouding": {
                        "aanvrager": {
                            "burgerservicenummer": "123456789",
                            "geboortedatum": "1980-01-01",
                            "geslachtsaanduiding": "1",
                            "geslachtsnaamstam": "Jansen",
                            "voorlettersAanschrijving": "J.",
                            "naamgebruik": "1",
                            "codeBrpGegevensGeheim": "0",
                            "nationaliteit": ["0"]
                        },
                        "leefsituatie": "3"
                    },
                    "ingangBijstandsuitkering": {
                        "datumMeldingBijGemeente": "2023-01-01",
                        "datumIngang": "2023-01-01"
                    },
                    "redenAanvraagLevensonderhoud": {
                        "onvoldoendeInkomen": "1"
                    }
                }
            }
        """.trimIndent()

        mockMvc.perform(
            post("/api/v1/LOBehandeld")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonRequest)
        )
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.foutcode").value("VALIDATION_ERROR"))
            .andExpect(jsonPath("$.fouten").isArray)
            .andExpect(jsonPath("$.fouten", hasItem(containsString("burgerservicenummer"))))
    }
}
