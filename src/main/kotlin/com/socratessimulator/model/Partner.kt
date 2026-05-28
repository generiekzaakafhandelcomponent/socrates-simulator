package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param partnerRelatietype 
 * @param ingangsdatumRelatie 
 */
data class Partner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("partnerRelatietype", required = true) val partnerRelatietype: PartnerRelatietype,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ingangsdatumRelatie", required = true) val ingangsdatumRelatie: java.time.LocalDate
)

