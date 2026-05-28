package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = Wit, 3 = Groen, 5 = Onbelast
 * Values: _1,_3,_5
 */
enum class KleurInkomen(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("5")
    _5("5")
}

