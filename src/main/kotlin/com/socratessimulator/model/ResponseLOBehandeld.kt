package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * response die altijd gegeven wordt
 * @param berichtId maakt een response aan met de minimale gegevens
 * @param responseId identificerend gegeven van verwerking door Wigo4it
 * @param timestamp datum tijd waarop verweking is afgerond
 * @param foutcode foutcode, indien er een fout is opgetreden
 * @param foutomschrijving korte functionele omschrijving van fout
 * @param details details van fout, indien aanwezig
 * @param fouten lijst van individuele validatiefouten, indien aanwezig
 */
data class ResponseLOBehandeld(

    @Schema(example = "null", required = true, description = "maakt een response aan met de minimale gegevens")
    @get:JsonProperty("berichtId", required = true) val berichtId: String?,

    @Schema(example = "null", required = true, description = "identificerend gegeven van verwerking door Wigo4it")
    @get:JsonProperty("responseId", required = true) val responseId: String?,

    @Schema(example = "null", description = "datum tijd waarop verweking is afgerond")
    @get:JsonProperty("timestamp") val timestamp: String? = null,

    @Schema(example = "null", description = "foutcode, indien er een fout is opgetreden")
    @get:JsonProperty("foutcode") val foutcode: String? = null,

    @Schema(example = "null", description = "korte functionele omschrijving van fout")
    @get:JsonProperty("foutomschrijving") val foutomschrijving: String? = null,

    @Schema(example = "null", description = "details van fout, indien aanwezig")
    @get:JsonProperty("details") val details: String? = null,

    @Schema(example = "null", description = "lijst van individuele validatiefouten, indien aanwezig")
    @get:JsonProperty("fouten") val fouten: List<String>? = null
)
