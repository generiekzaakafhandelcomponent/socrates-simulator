package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = Bedrijfspensioen, 2 = BuitenlandsPensioen, 3 = PensioenIvmOorlog, 4 = Invaliditeitspensioen, 5 = NabestaandenpensioenWeduweWeduwnaar, 6 = NabestaandenpensioenWezen
 * Values: _1,_2,_3,_4,_5,_6
 */
enum class InkomstensoortPensioen(val value: String) {

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
    _6("6")
}

