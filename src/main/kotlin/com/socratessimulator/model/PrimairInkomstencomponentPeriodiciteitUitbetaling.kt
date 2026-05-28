package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 0 = NVT, 1 = Dagelijks, 2 = Wekelijks, 3 = Tweewekelijks, 4 = Vierwekelijks, 5 = Vijfwekelijks, 6 = Maandelijks, 7 = Kwartaal, 8 = Jaar, 9 = Eenmalig
 * Values: _0,_1,_2,_3,_4,_5,_6,_7,_8,_9
 */
enum class PrimairInkomstencomponentPeriodiciteitUitbetaling(val value: String) {

    @JsonProperty("0")
    _0("0"),
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

