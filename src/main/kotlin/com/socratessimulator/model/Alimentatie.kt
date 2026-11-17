package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param soortInkomstencomponenttypeSpecifiekeGegevens
 * @param inkomstensoortAlimentatie
 */
data class Alimentatie(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "SoortInkomstencomponenttypeSpecifiekeGegevens",
        required = true
    ) override val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "InkomstensoortAlimentatie",
        required = true
    ) val inkomstensoortAlimentatie: InkomstensoortAlimentatie
) : InkomstencomponenttypeSpecifiekeGegevens
