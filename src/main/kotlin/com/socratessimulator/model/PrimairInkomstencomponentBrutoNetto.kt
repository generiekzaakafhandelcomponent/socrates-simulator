package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Br = Br, Nt = Nt
 * Values: Br,Nt
 */
enum class PrimairInkomstencomponentBrutoNetto(val value: String) {

    @JsonProperty("Br")
    Br("Br"),
    @JsonProperty("Nt")
    Nt("Nt")
}

