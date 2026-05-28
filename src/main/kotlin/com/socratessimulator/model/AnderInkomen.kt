package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param soortInkomstencomponenttypeSpecifiekeGegevens
 * @param categorie
 * @param beschrijvingAnderInkomen Beschrijving van de inkomsten uit ander inkomen en waarmee deze inkomsten gegenereerd worden.
 */
data class AnderInkomen(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "soortInkomstencomponenttypeSpecifiekeGegevens",
        required = true
    ) val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("categorie", required = true) val categorie: Categorie,

    @Schema(
        example = "null",
        description = "Beschrijving van de inkomsten uit ander inkomen en waarmee deze inkomsten gegenereerd worden."
    )
    @get:JsonProperty("beschrijvingAnderInkomen") val beschrijvingAnderInkomen: String? = null
)

