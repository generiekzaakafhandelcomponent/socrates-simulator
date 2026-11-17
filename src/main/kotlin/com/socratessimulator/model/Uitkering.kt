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
        "SoortInkomstencomponenttypeSpecifiekeGegevens",
        required = true
    ) override val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IndicatieBeslagOpUitkering") val indicatieBeslagOpUitkering: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IndicatieLoonheffingskorting") val indicatieLoonheffingskorting: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IndicatieReserveringVT") val indicatieReserveringVT: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("InkomstensoortUitkering") val inkomstensoortUitkering: UitkeringInkomstensoortUitkering? = null
) : InkomstencomponenttypeSpecifiekeGegevens
