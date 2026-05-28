package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

/**
 * 
 * @param codeTypeTelefoonnummer
 * @param eMailadres Het adres waaronder een PERSOON per elektronische post bereikbaar is.
 * @param indicatieGeheimTelefoonnummer
 * @param indicatieVoorkeurTelefoonnummer
 * @param telefoonLandnummer Het telefoon landnummer waaronder de PERSOON bereikbaar is.Norminstantie: ITU
 * @param telefoonnummer Het telefoonnummer waaronder een PERSOON bereikbaar is.
 */
data class Contactgegevens(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("codeTypeTelefoonnummer") val codeTypeTelefoonnummer: ContactgegevensCodeTypeTelefoonnummer? = null,

    @get:Pattern(regexp = "^[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)*@[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)*[.][A-Za-z0-9]+$")
    @get:Size(max = 70)
    @Schema(example = "null", description = "Het adres waaronder een PERSOON per elektronische post bereikbaar is.")
    @get:JsonProperty("eMailadres") val eMailadres: String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieGeheimTelefoonnummer") val indicatieGeheimTelefoonnummer: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("indicatieVoorkeurTelefoonnummer") val indicatieVoorkeurTelefoonnummer: JaNee? = null,

    @get:Min(0)
    @get:Max(2147483647)
    @Schema(
        example = "null",
        description = "Het telefoon landnummer waaronder de PERSOON bereikbaar is.Norminstantie: ITU"
    )
    @get:JsonProperty("telefoonLandnummer") val telefoonLandnummer: kotlin.Int? = null,

    @get:Pattern(regexp = "^0[1-9][0-9]{8}$")
    @Schema(example = "null", description = "Het telefoonnummer waaronder een PERSOON bereikbaar is.")
    @get:JsonProperty("telefoonnummer") val telefoonnummer: String? = null
)

