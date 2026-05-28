package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = BetaaldWerk, 2 = Uitkering, 3 = Alimentatie, 4 = Pensioen, 5 = AnderInkomen
 * Values: _1,_2,_3,_4,_5
 */
enum class SoortInkomstencomponenttypeSpecifiekeGegevens(val value: String) {

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

