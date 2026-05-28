package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDate
import jakarta.validation.Valid

/**
 * 
 * @param bekostiger
 * @param periodeStartdatum De datum waarop de inkomstenverhouding begon.
 * @param primairInkomstencomponent
 * @param periodeEinddatum De datum waarop de inkomstenverhouding eindigde.Als deze nog niet is geëindigd, is dit gegeven absent.
 */
data class Inkomstenverhouding(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("bekostiger", required = true) val bekostiger: Bekostiger,

    @field:Valid
    @Schema(example = "null", required = true, description = "De datum waarop de inkomstenverhouding begon.")
    @get:JsonProperty("periodeStartdatum", required = true) val periodeStartdatum: LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty(
        "primairInkomstencomponent",
        required = true
    ) val primairInkomstencomponent: PrimairInkomstencomponent,

    @field:Valid
    @Schema(
        example = "null",
        description = "De datum waarop de inkomstenverhouding eindigde.Als deze nog niet is geëindigd, is dit gegeven absent."
    )
    @get:JsonProperty("periodeEinddatum") val periodeEinddatum: LocalDate? = null
)

