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
        "SoortInkomstencomponenttypeSpecifiekeGegevens",
        required = true
    ) override val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Categorie", required = true) val categorie: Categorie,

    @Schema(
        example = "null",
        description = "Beschrijving van de inkomsten uit ander inkomen en waarmee deze inkomsten gegenereerd worden."
    )
    @get:JsonProperty("BeschrijvingAnderInkomen") val beschrijvingAnderInkomen: String? = null
) : InkomstencomponenttypeSpecifiekeGegevens
