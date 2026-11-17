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
    @get:JsonProperty("Bewoner", required = true) val bewoner: Bewoner,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("IndicatieKostendeler", required = true) val indicatieKostendeler: JaNee,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Relatietype", required = true) val relatietype: MedebewonerRelatietype,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("IngangsdatumRelatie", required = true) val ingangsdatumRelatie: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IndicatieZorgbehoefte") val indicatieZorgbehoefte: JaNee? = null
)

