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
    @get:JsonProperty("soortInkomstencomponenttypeSpecifiekeGegevens", required = true) val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("inkomstensoortPensioen", required = true) val inkomstensoortPensioen: InkomstensoortPensioen,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieLoonheffingskorting") val indicatieLoonheffingskorting: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieReserveringVT") val indicatieReserveringVT: JaNee? = null
)

