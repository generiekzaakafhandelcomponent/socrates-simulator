package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import java.time.LocalDate

/**
 * 
 * @param aanvraagdatum De datum waarop de aanvraag is ingediend.Doorgaans is dit de verzenddatum, echter, de aanvraag kan leiden tot een compleetheid- en juistheidtoets. Dit kan betekenen dat de aanvraag pas later wordt gecompleteerd.
 * @param aanvraagid 
 * @param codeOntvangendeGemeente De code van de gemeente, die de aanvraag ontvangt en verwerkt.
 * @param huishouding 
 * @param ingangBijstandsuitkering 
 * @param redenAanvraagLevensonderhoud 
 * @param besluit 
 */
data class LOBehandeld(

    @field:Valid
    @Schema(example = "null", required = true, description = "De datum waarop de aanvraag is ingediend.Doorgaans is dit de verzenddatum, echter, de aanvraag kan leiden tot een compleetheid- en juistheidtoets. Dit kan betekenen dat de aanvraag pas later wordt gecompleteerd.")
    @get:JsonProperty("Aanvraagdatum", required = true) val aanvraagdatum: LocalDate,

    @field:Pattern(regexp="^(\\{?([0-9a-fA-F]){8}-([0-9a-fA-F]){4}-([0-9a-fA-F]){4}-([0-9a-fA-F]){4}-([0-9a-fA-F]){12}\\}?)$")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Aanvraagid", required = true) val aanvraagid: String,

    @Schema(example = "null", required = true, description = "De code van de gemeente, die de aanvraag ontvangt en verwerkt.")
    @get:JsonProperty("CodeOntvangendeGemeente", required = true) val codeOntvangendeGemeente: String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Huishouding", required = true) val huishouding: Huishouding,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("IngangBijstandsuitkering", required = true) val ingangBijstandsuitkering: IngangBijstandsuitkering,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RedenAanvraagLevensonderhoud") val redenAanvraagLevensonderhoud: RedenAanvraagLevensonderhoud? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Besluit") val besluit: Besluit? = null
)

