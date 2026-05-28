package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = BekostigerOrganisatie, 2 = BekostigerPersoon
 * Values: _1,_2
 */
enum class SoortBekostiger(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2")
}

