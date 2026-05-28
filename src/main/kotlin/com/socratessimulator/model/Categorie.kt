package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 0 = Anders, 1 = VergoedingVrijwilligerswerk, 2 = AfkoopwaardeLijfrente, 3 = HuurOfOnderhuur, 4 = Giften, 5 = Toelagen, 6 = InkomenUitBuitenland, 7 = Zorgpremie, 8 = TeruggaveInkomstenbelasting, 9 = Hypotheekrenteaftrek, 10 = Combinatiekorting
 * Values: _0,_1,_2,_3,_4,_5,_6,_7,_8,_9,_10
 */
enum class Categorie(val value: String) {

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
    _9("9"),

    @JsonProperty("10")
    _10("10")
}

