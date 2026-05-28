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
        "soortInkomstencomponenttypeSpecifiekeGegevens",
        required = true
    ) val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "inkomstensoortAlimentatie",
        required = true
    ) val inkomstensoortAlimentatie: InkomstensoortAlimentatie
)

