package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param indicatieCoOuder
 * @param indicatieKinderbijslag
 * @param indicatieOnderhoudsplicht
 * @param indicatieThuiswonend
 * @param kind
 * @param ouderKindRelatietype
 */
data class OuderKind(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("IndicatieCoOuder", required = true) val indicatieCoOuder: OuderKindIndicatieCoOuder,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("IndicatieKinderbijslag", required = true) val indicatieKinderbijslag: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("IndicatieOnderhoudsplicht", required = true) val indicatieOnderhoudsplicht: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("IndicatieThuiswonend", required = true) val indicatieThuiswonend: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Kind", required = true) val kind: Kind,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("OuderKindRelatietype", required = true) val ouderKindRelatietype: OuderKindRelatietype
)

