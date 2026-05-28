package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size

/**
 * 
 * @param naam De feitelijke naam van de organisatorische eenheid.Bron: RGBZ2.0
 * @param omschrijving Een omschrijving van de organisatorische eenheid.Bron: RGBZ2.0
 * @param rol
 */
data class Betrokkene(

    @Schema(
        example = "null",
        required = true,
        description = "De feitelijke naam van de organisatorische eenheid.Bron: RGBZ2.0"
    )
    @get:JsonProperty("naam", required = true) val naam: String,

    @Schema(example = "null", description = "Een omschrijving van de organisatorische eenheid.Bron: RGBZ2.0")
    @get:JsonProperty("omschrijving") val omschrijving: String? = null,

    @field:Valid
    @field:Size(min = 1)
    @Schema(example = "null", description = "")
    @get:JsonProperty("rol") val rol: List<Rol>? = null
)

