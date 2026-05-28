package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
* 1 = WachtenBeslissingInstantie, 2 = WachtenDigid, 3 = OpnameInstelling, 4 = AndereRedenAfwijkendeStartdatum
* Values: _1,_2,_3,_4
*/
enum class Redenafwijkendestartdatumtype(val value: String) {

    @JsonProperty("1") _1("1"),
    @JsonProperty("2") _2("2"),
    @JsonProperty("3") _3("3"),
    @JsonProperty("4") _4("4")
}

