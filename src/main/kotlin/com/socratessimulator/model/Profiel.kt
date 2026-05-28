package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param inkomstenverhoudingen
 * @param indNietRechthebbend
 */
data class Profiel(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("inkomstenverhoudingen") val inkomstenverhoudingen: kotlin.collections.List<Inkomstenverhouding>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indNietRechthebbend") val indNietRechthebbend: JaNee? = null
)

