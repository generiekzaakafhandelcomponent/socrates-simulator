package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 01 = Prive, 02 = Werk, 03 = Vast, 04 = Mobiel, 05 = Fax, 06 = Sateliet
 * Values: _01,_02,_03,_04,_05,_06
 */
enum class ContactgegevensCodeTypeTelefoonnummer(val value: String) {

    @JsonProperty("01")
    _01("01"),

    @JsonProperty("02")
    _02("02"),

    @JsonProperty("03")
    _03("03"),

    @JsonProperty("04")
    _04("04"),

    @JsonProperty("05")
    _05("05"),

    @JsonProperty("06")
    _06("06")
}

