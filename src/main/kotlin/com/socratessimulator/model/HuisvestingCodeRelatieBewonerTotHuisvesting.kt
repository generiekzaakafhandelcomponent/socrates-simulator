package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 0 = Onbekend, 1 = Eigenaar, 2 = Huurder, 3 = OnderhuurderOfKamerbewoner, 6 = GehuisvestInInrichting, 7 = GeenVasteWoonOfVerblijfplaatsZwervend, 8 = GeenVasteWoonOfVerblijfplaatsBankTotBank, 9 = Anders, 99 = NietVanToepassing
 * Values: _0,_1,_2,_3,_6,_7,_8,_9,_99
 */
enum class HuisvestingCodeRelatieBewonerTotHuisvesting(val value: String) {

    @JsonProperty("0")
    _0("0"),

    @JsonProperty("1")
    _1("1"),

    @JsonProperty("2")
    _2("2"),

    @JsonProperty("3")
    _3("3"),

    @JsonProperty("6")
    _6("6"),

    @JsonProperty("7")
    _7("7"),

    @JsonProperty("8")
    _8("8"),

    @JsonProperty("9")
    _9("9"),

    @JsonProperty("99")
    _99("99")
}

