package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param soortInkomstencomponenttypeSpecifiekeGegevens
 * @param indicatieBeslagOpUitkering
 * @param indicatieLoonheffingskorting
 * @param indicatieReserveringVT
 * @param inkomstensoortUitkering
 */
data class Uitkering(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "soortInkomstencomponenttypeSpecifiekeGegevens",
        required = true
    ) val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieBeslagOpUitkering") val indicatieBeslagOpUitkering: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieLoonheffingskorting") val indicatieLoonheffingskorting: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieReserveringVT") val indicatieReserveringVT: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("inkomstensoortUitkering") val inkomstensoortUitkering: UitkeringInkomstensoortUitkering? = null
)

