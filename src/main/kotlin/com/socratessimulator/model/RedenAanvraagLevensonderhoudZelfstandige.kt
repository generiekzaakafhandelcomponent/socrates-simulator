package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = GestoptMetEigenBedrijf, 2 = EigenBedrijfOnvoldoendeInkomen, 3 = EigenBedrijfTijdelijkGeslotenDoorGemeente
 * Values: _1,_2,_3
 */
enum class RedenAanvraagLevensonderhoudZelfstandige(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3")
}

