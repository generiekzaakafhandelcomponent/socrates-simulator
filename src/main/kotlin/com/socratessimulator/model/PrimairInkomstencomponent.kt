package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param brutoNetto 
 * @param periodeStartdatum De startdatum van de periode waarop het geboekte bedrag in dit inkomstencomponent betrekking heeft.
 * @param primairInkomstencomponenttype 
 * @param inkomsten Het geldbedrag waarop de boeking betrekking heeft geldig voor de periode in dit inkomstencomponent.
 * @param inkomstencomponenttypeSpecifiekeGegevens 
 * @param periodeEinddatum De einddatum van de periode waarop het geboekte bedrag in dit inkomstencomponent betrekking heeft.
 * @param periodiciteitUitbetaling 
 * @param secundairInkomstencomponent 
 * @param kleurLoonbelastingtabel 
 */
data class PrimairInkomstencomponent(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("brutoNetto", required = true) val brutoNetto: PrimairInkomstencomponentBrutoNetto,

    @field:Valid
    @Schema(example = "null", required = true, description = "De startdatum van de periode waarop het geboekte bedrag in dit inkomstencomponent betrekking heeft.")
    @get:JsonProperty("periodeStartdatum", required = true) val periodeStartdatum: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("primairInkomstencomponenttype", required = true) val primairInkomstencomponenttype: PrimairInkomstencomponenttype,

    @field:Pattern(regexp="^-?[0-9]+((;|,|\\\\.)[0-9]{2}|)$")
    @Schema(example = "null", description = "Het geldbedrag waarop de boeking betrekking heeft geldig voor de periode in dit inkomstencomponent.")
    @get:JsonProperty("inkomsten") val inkomsten: String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("inkomstencomponenttypeSpecifiekeGegevens") val inkomstencomponenttypeSpecifiekeGegevens: InkomstencomponenttypeSpecifiekeGegevens? = null,

    @field:Valid
    @Schema(example = "null", description = "De einddatum van de periode waarop het geboekte bedrag in dit inkomstencomponent betrekking heeft.")
    @get:JsonProperty("periodeEinddatum") val periodeEinddatum: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("periodiciteitUitbetaling") val periodiciteitUitbetaling: PrimairInkomstencomponentPeriodiciteitUitbetaling? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("secundairInkomstencomponent") val secundairInkomstencomponent: kotlin.collections.List<SecundairInkomstencomponent>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("kleurLoonbelastingtabel") val kleurLoonbelastingtabel: KleurInkomen? = null
)

