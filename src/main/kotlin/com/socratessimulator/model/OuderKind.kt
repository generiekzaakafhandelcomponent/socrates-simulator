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
    @get:JsonProperty("indicatieCoOuder", required = true) val indicatieCoOuder: OuderKindIndicatieCoOuder,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("indicatieKinderbijslag", required = true) val indicatieKinderbijslag: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("indicatieOnderhoudsplicht", required = true) val indicatieOnderhoudsplicht: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("indicatieThuiswonend", required = true) val indicatieThuiswonend: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("kind", required = true) val kind: Kind,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ouderKindRelatietype", required = true) val ouderKindRelatietype: OuderKindRelatietype
)

