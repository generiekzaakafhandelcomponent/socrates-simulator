package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param datumMeldingBijGemeente Indien er direct een aanvraag is gedaan dan is de melddatum gelijk aan datum waarop aanvraag is ontvangen.
 * @param afwijkendeIngangsdatum
 * @param gewensteStartdatumUitkering Gewenste datum waarop uitkering ingaat
 * @param redenAfwijkendestartdatum
 */
data class IngangBijstandsuitkering(

    @field:Valid
    @Schema(
        example = "null",
        required = true,
        description = "Indien er direct een aanvraag is gedaan dan is de melddatum gelijk aan datum waarop aanvraag is ontvangen."
    )
    @get:JsonProperty("datumMeldingBijGemeente", required = true) val datumMeldingBijGemeente: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("afwijkendeIngangsdatum") val afwijkendeIngangsdatum: JaNee? = null,

    @field:Valid
    @Schema(example = "null", description = "Gewenste datum waarop uitkering ingaat")
    @get:JsonProperty("gewensteStartdatumUitkering") val gewensteStartdatumUitkering: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("redenAfwijkendestartdatum") val redenAfwijkendestartdatum: RedenAfwijkendeStartdatum? = null
)

