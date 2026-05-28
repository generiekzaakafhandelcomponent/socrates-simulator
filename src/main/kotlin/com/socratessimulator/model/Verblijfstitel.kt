package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * 
 * @param codeVerblijfstitel
 * @param datumAanvangVerblijfstitel De datum van de eerste dag waarop de VERBLIJFSTITEL van toepassing is.Norminstantie: UGR
 * @param datumEindeVerblijfstitel De datum van de laatste dag waarop de VERBLIJFSTITEL van toepassing is.Norminstantie: UGR
 */
data class Verblijfstitel(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("codeVerblijfstitel") val codeVerblijfstitel: VerblijfstitelCodeVerblijfstitel? = null,

    @field:Valid
    @Schema(
        example = "null",
        description = "De datum van de eerste dag waarop de VERBLIJFSTITEL van toepassing is.Norminstantie: UGR"
    )
    @get:JsonProperty("datumAanvangVerblijfstitel") val datumAanvangVerblijfstitel: java.time.LocalDate? = null,

    @field:Valid
    @Schema(
        example = "null",
        description = "De datum van de laatste dag waarop de VERBLIJFSTITEL van toepassing is.Norminstantie: UGR"
    )
    @get:JsonProperty("datumEindeVerblijfstitel") val datumEindeVerblijfstitel: java.time.LocalDate? = null
)

