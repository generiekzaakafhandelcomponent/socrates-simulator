package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param soortInkomstencomponenttypeSpecifiekeGegevens
 * @param indicatieLoonheffingskorting
 * @param indicatieReserveringVT
 */
data class BetaaldWerk(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "soortInkomstencomponenttypeSpecifiekeGegevens",
        required = true
    ) val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("indicatieLoonheffingskorting", required = true) val indicatieLoonheffingskorting: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("indicatieReserveringVT", required = true) val indicatieReserveringVT: JaNee
)

