package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param adres
 * @param codeFunctieAdres
 * @param begindatum
 */
data class Adreshouding(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Adres", required = true) val adres: Adres,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CodeFunctieAdres", required = true) val codeFunctieAdres: AdreshoudingCodeFunctieAdres,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Begindatum", required = true) val begindatum: java.time.LocalDate
)

