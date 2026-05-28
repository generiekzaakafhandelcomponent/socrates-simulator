package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 01 = Klant, 02 = Partner, 03 = Gesplitst, 04 = Gemachtigde, 05 = Bewindvoerder
 * Values: _01,_02,_03,_04,_05
 */
enum class UitbetalingUitkeringSoortUitbetaling(val value: String) {

    @JsonProperty("01")
    _01("01"),
    @JsonProperty("02")
    _02("02"),
    @JsonProperty("03")
    _03("03"),
    @JsonProperty("04")
    _04("04"),
    @JsonProperty("05")
    _05("05")
}

