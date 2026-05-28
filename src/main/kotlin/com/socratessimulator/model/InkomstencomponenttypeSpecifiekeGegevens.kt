package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param soortInkomstencomponenttypeSpecifiekeGegevens
 * @param indicatieLoonheffingskorting
 * @param indicatieReserveringVT
 * @param inkomstensoortAlimentatie
 * @param inkomstensoortPensioen
 * @param categorie
 * @param indicatieBeslagOpUitkering
 * @param inkomstensoortUitkering
 * @param beschrijvingAnderInkomen Beschrijving van de inkomsten uit ander inkomen en waarmee deze inkomsten gegenereerd worden.
 */

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "soortInkomstencomponenttypeSpecifiekeGegevens",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(value = Alimentatie::class, name = "Alimentatie"),
    JsonSubTypes.Type(value = AnderInkomen::class, name = "AnderInkomen"),
    JsonSubTypes.Type(value = BetaaldWerk::class, name = "BetaaldWerk"),
    JsonSubTypes.Type(value = Pensioen::class, name = "Pensioen"),
    JsonSubTypes.Type(value = Uitkering::class, name = "Uitkering")
)

interface InkomstencomponenttypeSpecifiekeGegevens {
    @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
    val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens

    @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
    val indicatieLoonheffingskorting: JaNee

    @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
    val indicatieReserveringVT: JaNee

    @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
    val inkomstensoortAlimentatie: InkomstensoortAlimentatie

    @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
    val inkomstensoortPensioen: InkomstensoortPensioen

    @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
    val categorie: Categorie

    @get:Schema(example = "null", description = "")
    val indicatieBeslagOpUitkering: JaNee?

    @get:Schema(example = "null", description = "")
    val inkomstensoortUitkering: UitkeringInkomstensoortUitkering?

    @get:Schema(
        example = "null",
        description = "Beschrijving van de inkomsten uit ander inkomen en waarmee deze inkomsten gegenereerd worden."
    )
    val beschrijvingAnderInkomen: String?


}

