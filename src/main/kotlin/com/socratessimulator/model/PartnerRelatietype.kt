package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = Partnergehuwd, 2 = Partnergeregistreerd, 3 = Partnerongehuwd, 4 = Overigefamilierelatie
 * Values: _1,_2,_3,_4
 */
enum class PartnerRelatietype(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("4")
    _4("4")
}

