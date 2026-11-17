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
    @get:JsonProperty("RedenAfwijkingAanwezig", required = true) val redenAfwijkingAanwezig: JaNee,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AanvraagdatumDigid") val aanvraagdatumDigid: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OntvangstdatumBeslissingInstantie") val ontvangstdatumBeslissingInstantie: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Redenafwijkendestartdatumtype") val redenafwijkendestartdatumtype: Redenafwijkendestartdatumtype? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("SpecificatieBijzondereRedenLaterIngaanStartdatumAanvraag") val specificatieBijzondereRedenLaterIngaanStartdatumAanvraag: String? = null
)

