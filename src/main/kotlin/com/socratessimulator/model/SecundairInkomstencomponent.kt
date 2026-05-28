package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param secundairInkomstencomponenttype
 * @param boekingsdatum De datum waarop het bedrag in dit inkomstencomponent is geboekt op een rekening van de klant.
 * @param inkomsten Het geldbedrag waarop de boeking betrekking heeft geldig voor de periode in dit inkomstencomponent.
 */
data class SecundairInkomstencomponent(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "secundairInkomstencomponenttype",
        required = true
    ) val secundairInkomstencomponenttype: SecundairInkomstencomponenttype,

    @field:Valid
    @Schema(
        example = "null",
        description = "De datum waarop het bedrag in dit inkomstencomponent is geboekt op een rekening van de klant."
    )
    @get:JsonProperty("boekingsdatum") val boekingsdatum: java.time.LocalDate? = null,

    @field:Pattern(regexp = "^-?[0-9]+((;|,|\\\\.)[0-9]{2}|)$")
    @Schema(
        example = "null",
        description = "Het geldbedrag waarop de boeking betrekking heeft geldig voor de periode in dit inkomstencomponent."
    )
    @get:JsonProperty("inkomsten") val inkomsten: String? = null
)
