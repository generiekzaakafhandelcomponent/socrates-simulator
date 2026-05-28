package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = AVWBBudget, 2 = Heffingskorting, 3 = Inkomstenvermindering, 4 = Vakantiegeld, 5 = Vergoeding, 6 = Toeslag
 * Values: _1,_2,_3,_4,_5,_6
 */
enum class SecundairInkomstencomponenttype(val value: String) {

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

