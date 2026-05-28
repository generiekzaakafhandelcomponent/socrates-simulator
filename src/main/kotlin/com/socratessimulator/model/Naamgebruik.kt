package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Een aanduiding voor de wijze van aanschrijving van de NATUURLIJK PERSOON.   1 = EigenNaam, 2 = ExEchtgenoot, 3 = ExEchtgenootEigenNaam, 4 = EigenNaamExEchtgenoot
 * Values: _1,_2,_3,_4
 */
enum class Naamgebruik(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("4")
    _4("4")
}

