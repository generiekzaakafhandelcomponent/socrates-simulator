package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param rolomschrijving Algemeen gehanteerde benaming van de aard van de ROL
 */
data class Rol(

    @Schema(example = "null", required = true, description = "Algemeen gehanteerde benaming van de aard van de ROL")
    @get:JsonProperty("rolomschrijving", required = true) val rolomschrijving: String
)

