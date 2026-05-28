package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * OK = OK, PP = PP
 * Values: OK,PP
 */
enum class OuderKindRelatietype(val value: String) {

    @JsonProperty("OK")
    OK("OK"),
    @JsonProperty("PP")
    PP("PP")
}

