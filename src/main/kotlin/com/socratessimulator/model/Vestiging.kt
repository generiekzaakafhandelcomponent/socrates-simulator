package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param kvkNummer
 * @param vestigingsnummer Landelijk uniek identificerend administratienummer van een VESTIGING zoals toegewezen door de Kamer van Koophandel (KvK).Bron: RSGB3.0
 */
data class Vestiging(

    @field:Pattern(regexp = "^[0-9]{8}$")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("kvkNummer", required = true) val kvkNummer: String,

    @field:Pattern(regexp = "^[0-9]{12}$")
    @Schema(
        example = "null",
        description = "Landelijk uniek identificerend administratienummer van een VESTIGING zoals toegewezen door de Kamer van Koophandel (KvK).Bron: RSGB3.0"
    )
    @get:JsonProperty("vestigingsnummer") val vestigingsnummer: String? = null
)

