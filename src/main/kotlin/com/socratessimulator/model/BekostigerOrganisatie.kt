package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param soortBekostiger
 * @param loonheffingsnummer Het loonheffingsnummer op de loonstrook van de persoon.Bron: GBI-Werkgroep Ontologie Inkomen
 * @param naam De feitelijke naam van de organisatorische eenheid.Bron: RGBZ2.0
 */
data class BekostigerOrganisatie(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("soortBekostiger", required = true) val soortBekostiger: SoortBekostiger,

    @get:Pattern(regexp = "^\\d{8,9}L\\d{2}$")
    @Schema(
        example = "null",
        required = true,
        description = "Het loonheffingsnummer op de loonstrook van de persoon.Bron: GBI-Werkgroep Ontologie Inkomen"
    )
    @get:JsonProperty("loonheffingsnummer", required = true) val loonheffingsnummer: String,

    @get:Pattern(regexp = "^[\\p{L}\\p{M}\\-'\\.,\\s]{1, 40}$")
    @Schema(
        example = "null",
        required = true,
        description = "De feitelijke naam van de organisatorische eenheid.Bron: RGBZ2.0"
    )
    @get:JsonProperty("naam", required = true) val naam: String
)

