package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param aanvrager
 * @param inAanmerkingTeNemenVermogen Totaal van het in aanmerking te nemen vermogen van leden gezamenlijke huishouding plus de vermogens van de ten laste komende kinderen die op zelfde adres wonen.
 * @param leefsituatie
 * @param medeaanvrager
 * @param uitbetalingUitkering
 */
data class Huishouding(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("aanvrager", required = true) val aanvrager: Persoon,

    @get:Pattern(regexp = "^-?[0-9]+((;|,|\\\\.)[0-9]{2}|)$")
    @Schema(
        example = "null",
        description = "Totaal van het in aanmerking te nemen vermogen van leden gezamenlijke huishouding plus de vermogens van de ten laste komende kinderen die op zelfde adres wonen."
    )
    @get:JsonProperty("inAanmerkingTeNemenVermogen") val inAanmerkingTeNemenVermogen: String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("leefsituatie") val leefsituatie: Leefsituatie? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("medeaanvrager") val medeaanvrager: Persoon? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("uitbetalingUitkering") val uitbetalingUitkering: UitbetalingUitkering? = null
)

