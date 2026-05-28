package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = Alimentatie, 2 = AnderInkomen, 3 = BetaaldWerk, 4 = Pensioen, 5 = Studiefinanciering, 6 = Uitkering, 7 = Stage, 8 = Hobby, 9 = EigenBedrijf
 * Values: _1,_2,_3,_4,_5,_6,_7,_8,_9
 */
enum class PrimairInkomstencomponenttype(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("4")
    _4("4"),
    @JsonProperty("5")
    _5("5"),
    @JsonProperty("6")
    _6("6"),
    @JsonProperty("7")
    _7("7"),
    @JsonProperty("8")
    _8("8"),
    @JsonProperty("9")
    _9("9")
}

