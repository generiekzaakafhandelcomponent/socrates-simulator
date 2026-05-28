package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Code die aangeeft dat de persoonsgegevens, volgens Basisregistratie Personen, wel of niet aan een andere organisatie (derden, kerken) verstrekt mogen worden.   0 = GeenRestricties, 1 = NietDerdenVerbindendVoorschrift, 2 = NietKerken, 3 = NietVrijeDerden, 4 = NietDerdenVerbindendVoorschriftEnKerken, 5 = NietDerdenVerbindendVoorschriftEnDerden, 6 = NietKerkenEnDerden, 7 = NietDerdenVerbindendVoorschriftEnKerkenEnDerden
 * Values: _0,_1,_2,_3,_4,_5,_6,_7
 */
enum class Geheim(val value: String) {

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
    _7("7")
}

