package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = Ja, 2 = Nee, 8 = NVT
 * Values: _1,_2,_8
 */
enum class OuderKindIndicatieCoOuder(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("8")
    _8("8")
}

