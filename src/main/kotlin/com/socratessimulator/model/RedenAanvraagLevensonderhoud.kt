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
    @get:JsonProperty("OnvoldoendeInkomen") val onvoldoendeInkomen: RedenAanvraagLevensonderhoudOnvoldoendeInkomen? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("TeLaagInkomen") val teLaagInkomen: RedenAanvraagLevensonderhoudTeLaagInkomen? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("UitkeringStopgezet") val uitkeringStopgezet: RedenAanvraagLevensonderhoudUitkeringStopgezet? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Verblijfstatus") val verblijfstatus: RedenAanvraagLevensonderhoudVerblijfstatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("WijzigingGezin") val wijzigingGezin: RedenAanvraagLevensonderhoudWijzigingGezin? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Zelfstandige") val zelfstandige: RedenAanvraagLevensonderhoudZelfstandige? = null
)

