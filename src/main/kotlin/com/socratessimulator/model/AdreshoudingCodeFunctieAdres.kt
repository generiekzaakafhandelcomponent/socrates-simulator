package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A = A, B = B, C = C, L = L, V = V, W = W
 * Values: A,B,C,L,V,W
 */
enum class AdreshoudingCodeFunctieAdres(val value: String) {

    @JsonProperty("A")
    A("A"),
    @JsonProperty("B")
    B("B"),
    @JsonProperty("C")
    C("C"),
    @JsonProperty("L")
    L("L"),
    @JsonProperty("V")
    V("V"),
    @JsonProperty("W")
    W("W")
}

