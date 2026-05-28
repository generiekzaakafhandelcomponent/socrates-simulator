package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = VerblijfsvergunningGekregen, 2 = VerblijfsvergunningGekregenEnVertrekUitAsielzoekerscentrum
 * Values: _1,_2
 */
enum class RedenAanvraagLevensonderhoudVerblijfstatus(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2")
}

