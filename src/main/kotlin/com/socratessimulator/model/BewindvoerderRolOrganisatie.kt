package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * AR = AR, C = C, B = B
 * Values: AR,C,B
 */
enum class BewindvoerderRolOrganisatie(val value: String) {

    @JsonProperty("AR")
    AR("AR"),

    @JsonProperty("C")
    C("C"),

    @JsonProperty("B")
    B("B")
}

