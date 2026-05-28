package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param rolOrganisatie
 * @param vestiging
 */
data class Bewindvoerder(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("rolOrganisatie", required = true) val rolOrganisatie: BewindvoerderRolOrganisatie,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("vestiging", required = true) val vestiging: Vestiging
)

