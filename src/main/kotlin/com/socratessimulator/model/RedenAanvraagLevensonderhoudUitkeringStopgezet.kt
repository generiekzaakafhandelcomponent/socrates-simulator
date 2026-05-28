package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = EindeWWUitkering, 2 = EindeZWUitkering, 3 = EindeWGAUitkering, 4 = EindeWAOIVAUitkering, 5 = EindeOverigeUitkering
 * Values: _1,_2,_3,_4,_5
 */
enum class RedenAanvraagLevensonderhoudUitkeringStopgezet(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("4")
    _4("4"),
    @JsonProperty("5")
    _5("5")
}

