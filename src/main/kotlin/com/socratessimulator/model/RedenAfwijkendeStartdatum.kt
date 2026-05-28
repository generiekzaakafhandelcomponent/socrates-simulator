package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param redenAfwijkingAanwezig
 * @param aanvraagdatumDigid
 * @param ontvangstdatumBeslissingInstantie
 * @param redenafwijkendestartdatumtype
 * @param specificatieBijzondereRedenLaterIngaanStartdatumAanvraag
 */
data class RedenAfwijkendeStartdatum(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("redenAfwijkingAanwezig", required = true) val redenAfwijkingAanwezig: JaNee,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("aanvraagdatumDigid") val aanvraagdatumDigid: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ontvangstdatumBeslissingInstantie") val ontvangstdatumBeslissingInstantie: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("redenafwijkendestartdatumtype") val redenafwijkendestartdatumtype: Redenafwijkendestartdatumtype? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("specificatieBijzondereRedenLaterIngaanStartdatumAanvraag") val specificatieBijzondereRedenLaterIngaanStartdatumAanvraag: String? = null
)

