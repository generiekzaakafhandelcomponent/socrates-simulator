package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min

/**
 * 
 * @param codeRelatieBewonerTotHuisvesting
 * @param indicatieZelfstandigeWoonruimte
 * @param aantalDagenPerWeekInInstellingOfOpvang Het aantal dagen per week dat men in een instelling of opvang verblijft. Dit attribuut moet zijn ingevuld als de CodeRelatieBewonerTotHuisvesting aangeeft dat men in een instelling zit.
 * @param indicatieHuur
 * @param indicatieInDetentie
 * @param indicatieInstellingVolledigVerzorgd
 * @param toelichtingHuisvesting Toelichting op de woonsituatie van de PERSOON betreffende de huisvesting.Bron: SGR 16.0
 * @param toelichtingRelatieBewonerTotHuisvesting Toelichting op de hoedanigheid waarin de PERSOON de woning bewoont.Norminstantie: SGR
 */
data class Huisvesting(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "codeRelatieBewonerTotHuisvesting",
        required = true
    ) val codeRelatieBewonerTotHuisvesting: HuisvestingCodeRelatieBewonerTotHuisvesting,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("indicatieZelfstandigeWoonruimte", required = true) val indicatieZelfstandigeWoonruimte: JaNee,

    @get:Min(0)
    @get:Max(2147483647)
    @Schema(
        example = "null",
        description = "Het aantal dagen per week dat men in een instelling of opvang verblijft. Dit attribuut moet zijn ingevuld als de CodeRelatieBewonerTotHuisvesting aangeeft dat men in een instelling zit."
    )
    @get:JsonProperty("aantalDagenPerWeekInInstellingOfOpvang") val aantalDagenPerWeekInInstellingOfOpvang: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieHuur") val indicatieHuur: IndicatieHuur? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieInDetentie") val indicatieInDetentie: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieInstellingVolledigVerzorgd") val indicatieInstellingVolledigVerzorgd: JaNee? = null,

    @Schema(
        example = "null",
        description = "Toelichting op de woonsituatie van de PERSOON betreffende de huisvesting.Bron: SGR 16.0"
    )
    @get:JsonProperty("toelichtingHuisvesting") val toelichtingHuisvesting: String? = null,

    @Schema(
        example = "null",
        description = "Toelichting op de hoedanigheid waarin de PERSOON de woning bewoont.Norminstantie: SGR"
    )
    @get:JsonProperty("toelichtingRelatieBewonerTotHuisvesting") val toelichtingRelatieBewonerTotHuisvesting: String? = null
)

