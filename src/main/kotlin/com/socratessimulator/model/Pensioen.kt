package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param soortInkomstencomponenttypeSpecifiekeGegevens 
 * @param inkomstensoortPensioen 
 * @param indicatieLoonheffingskorting 
 * @param indicatieReserveringVT 
 */
data class Pensioen(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("SoortInkomstencomponenttypeSpecifiekeGegevens", required = true) override val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InkomstensoortPensioen", required = true) val inkomstensoortPensioen: InkomstensoortPensioen,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IndicatieLoonheffingskorting") val indicatieLoonheffingskorting: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IndicatieReserveringVT") val indicatieReserveringVT: JaNee? = null
) : InkomstencomponenttypeSpecifiekeGegevens
