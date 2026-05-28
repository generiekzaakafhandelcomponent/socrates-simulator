package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param bewoner
 * @param indicatieKostendeler
 * @param relatietype
 * @param ingangsdatumRelatie
 * @param indicatieZorgbehoefte
 */
data class Medebewoner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bewoner", required = true) val bewoner: Bewoner,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("indicatieKostendeler", required = true) val indicatieKostendeler: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("relatietype", required = true) val relatietype: MedebewonerRelatietype,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ingangsdatumRelatie", required = true) val ingangsdatumRelatie: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieZorgbehoefte") val indicatieZorgbehoefte: JaNee? = null
)

