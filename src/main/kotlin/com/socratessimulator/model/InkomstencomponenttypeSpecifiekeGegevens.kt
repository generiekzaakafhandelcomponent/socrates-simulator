package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Polymorf type; het discriminatorveld SoortInkomstencomponenttypeSpecifiekeGegevens bepaalt het subtype:
 * 1 = BetaaldWerk, 2 = Uitkering, 3 = Alimentatie, 4 = Pensioen, 5 = AnderInkomen
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "SoortInkomstencomponenttypeSpecifiekeGegevens",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(value = BetaaldWerk::class, name = "1"),
    JsonSubTypes.Type(value = Uitkering::class, name = "2"),
    JsonSubTypes.Type(value = Alimentatie::class, name = "3"),
    JsonSubTypes.Type(value = Pensioen::class, name = "4"),
    JsonSubTypes.Type(value = AnderInkomen::class, name = "5")
)
@Schema(oneOf = [BetaaldWerk::class, Uitkering::class, Alimentatie::class, Pensioen::class, AnderInkomen::class])
interface InkomstencomponenttypeSpecifiekeGegevens {
    val soortInkomstencomponenttypeSpecifiekeGegevens: SoortInkomstencomponenttypeSpecifiekeGegevens
}
