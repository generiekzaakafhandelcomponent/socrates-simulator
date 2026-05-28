package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param dienst
 */
data class Besluit(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("dienst", required = true) val dienst: Dienst
)

