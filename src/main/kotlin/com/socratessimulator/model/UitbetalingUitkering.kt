package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param soortUitbetaling
 * @param aanDerdeReden De reden waarom er aan een derde uitbetaald moet worden. Een derde is een bewindvoerder of een gemachtigde zoals een curator, een organisatie voor matschappelijke opvang of een famililid.
 * @param bankrekening
 * @param bankrekeningDerde IBAN nummer van derde. Een derde is een bewindvoerder of een gemachtigde zoals een curator, een organisatie voor maatschappelijke opvang of een famililid.
 * @param bankrekeningPartner IBAN nummer van partner aanvrager
 * @param rekeninghouder Naam rekeninghouder.
 * @param rekeninghouderDerde Naam rekeninghouder derde. Een derde is een bewindvoerder of een gemachtigde zoals een curator, een organisatie voor maatschappelijke opvang of een famililid.
 * @param rekeninghouderPartner Naam rekeninghouder van partner aanvrager
 */
data class UitbetalingUitkering(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("soortUitbetaling", required = true) val soortUitbetaling: UitbetalingUitkeringSoortUitbetaling,

    @Schema(
        example = "null",
        description = "De reden waarom er aan een derde uitbetaald moet worden. Een derde is een bewindvoerder of een gemachtigde zoals een curator, een organisatie voor matschappelijke opvang of een famililid."
    )
    @get:JsonProperty("aanDerdeReden") val aanDerdeReden: String? = null,

    @get:Pattern(regexp = "^[A-Z]{2}[0-9]{2}[A-Z0-9]{11,30}$")
    @Schema(example = "null", description = "")
    @get:JsonProperty("bankrekening") val bankrekening: String? = null,

    @get:Pattern(regexp = "^[A-Z]{2}[0-9]{2}[A-Z0-9]{11,30}$")
    @Schema(
        example = "null",
        description = "IBAN nummer van derde. Een derde is een bewindvoerder of een gemachtigde zoals een curator, een organisatie voor maatschappelijke opvang of een famililid."
    )
    @get:JsonProperty("bankrekeningDerde") val bankrekeningDerde: String? = null,

    @get:Pattern(regexp = "^[A-Z]{2}[0-9]{2}[A-Z0-9]{11,30}$")
    @Schema(example = "null", description = "IBAN nummer van partner aanvrager")
    @get:JsonProperty("bankrekeningPartner") val bankrekeningPartner: String? = null,

    @Schema(example = "null", description = "Naam rekeninghouder.")
    @get:JsonProperty("rekeninghouder") val rekeninghouder: String? = null,

    @Schema(
        example = "null",
        description = "Naam rekeninghouder derde. Een derde is een bewindvoerder of een gemachtigde zoals een curator, een organisatie voor maatschappelijke opvang of een famililid."
    )
    @get:JsonProperty("rekeninghouderDerde") val rekeninghouderDerde: String? = null,

    @Schema(example = "null", description = "Naam rekeninghouder van partner aanvrager")
    @get:JsonProperty("rekeninghouderPartner") val rekeninghouderPartner: String? = null
)

