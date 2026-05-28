package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param onvoldoendeInkomen
 * @param teLaagInkomen
 * @param uitkeringStopgezet
 * @param verblijfstatus
 * @param wijzigingGezin
 * @param zelfstandige
 */
data class RedenAanvraagLevensonderhoud(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("onvoldoendeInkomen") val onvoldoendeInkomen: RedenAanvraagLevensonderhoudOnvoldoendeInkomen? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("teLaagInkomen") val teLaagInkomen: RedenAanvraagLevensonderhoudTeLaagInkomen? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("uitkeringStopgezet") val uitkeringStopgezet: RedenAanvraagLevensonderhoudUitkeringStopgezet? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("verblijfstatus") val verblijfstatus: RedenAanvraagLevensonderhoudVerblijfstatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("wijzigingGezin") val wijzigingGezin: RedenAanvraagLevensonderhoudWijzigingGezin? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("zelfstandige") val zelfstandige: RedenAanvraagLevensonderhoudZelfstandige? = null
)

