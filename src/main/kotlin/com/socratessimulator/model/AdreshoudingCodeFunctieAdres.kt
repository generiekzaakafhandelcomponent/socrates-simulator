package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A = Afwijkend woonadres, C = Correspondentieadres, L = Loonaangifte adres, V = Vestigingsadres
 * Values: A,C,L,V
 */
enum class AdreshoudingCodeFunctieAdres(val value: String) {

    @JsonProperty("A")
    A("A"),
    @JsonProperty("C")
    C("C"),
    @JsonProperty("L")
    L("L"),
    @JsonProperty("V")
    V("V")
}
