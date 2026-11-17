package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Polymorf type; het discriminatorveld SoortBekostiger bepaalt het subtype:
 * 1 = BekostigerOrganisatie, 2 = BekostigerPersoon
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "SoortBekostiger",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(value = BekostigerOrganisatie::class, name = "1"),
    JsonSubTypes.Type(value = BekostigerPersoon::class, name = "2")
)
@Schema(oneOf = [BekostigerOrganisatie::class, BekostigerPersoon::class])
interface Bekostiger {
    val soortBekostiger: SoortBekostiger
}
