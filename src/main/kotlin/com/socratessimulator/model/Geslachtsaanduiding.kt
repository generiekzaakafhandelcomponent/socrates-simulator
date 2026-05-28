package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 0 = Onbekend, 1 = Man, 2 = Vrouw
 * Values: _0,_1,_2
 */
enum class Geslachtsaanduiding(val value: String) {

    @JsonProperty("0")
    _0("0"),

    @JsonProperty("1")
    _1("1"),

    @JsonProperty("2")
    _2("2")
}

