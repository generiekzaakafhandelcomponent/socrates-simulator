package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param begindatum
 * @param einddatum
 */
data class Dienst(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("begindatum", required = true) val begindatum: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("einddatum", required = true) val einddatum: java.time.LocalDate
)

