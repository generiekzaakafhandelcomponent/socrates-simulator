package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param identificatie De unieke identificatie van de ZAAK binnen de organisatie die verantwoordelijk is voor de behandeling van de ZAAK.
 * @param loBehandeld
 * @param betrokkenen
 * @param url URL-referentie naar dit object. Dit is de unieke identificatie en locatie van dit object.
 * @param uuid De unieke identificatie van de ZAAK binnen de organisatie die verantwoordelijk is voor de behandeling van de ZAAK.
 */
data class ZaakLOBehandeld(

    @Schema(
        example = "null",
        required = true,
        description = "De unieke identificatie van de ZAAK binnen de organisatie die verantwoordelijk is voor de behandeling van de ZAAK."
    )
    @get:JsonProperty("identificatie", required = true) val identificatie: String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("loBehandeld", required = true) val loBehandeld: LOBehandeld,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("betrokkenen") val betrokkenen: List<Betrokkene>? = null,

    @Schema(
        example = "null",
        description = "URL-referentie naar dit object. Dit is de unieke identificatie en locatie van dit object."
    )
    @get:JsonProperty("url") val url: String? = null,

    @field:Pattern(regexp = "^(\\{?([0-9a-fA-F]){8}-([0-9a-fA-F]){4}-([0-9a-fA-F]){4}-([0-9a-fA-F]){4}-([0-9a-fA-F]){12}\\}?)$")
    @Schema(
        example = "null",
        description = "De unieke identificatie van de ZAAK binnen de organisatie die verantwoordelijk is voor de behandeling van de ZAAK."
    )
    @get:JsonProperty("uuid") val uuid: String? = null
)

