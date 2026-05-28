package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = NederlandsStraatadres, 2 = NederlandsPostbusadres, 3 = StraatadresBuitenland
 * Values: _1,_2,_3
 */
enum class SoortAdres(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3")
}

