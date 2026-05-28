package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = EigenUitkeringMaarNuSamenAanvraagMetPartner, 2 = RelatieVerbroken, 3 = PartnerOverleden
 * Values: _1,_2,_3
 */
enum class RedenAanvraagLevensonderhoudWijzigingGezin(val value: String) {

    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3")
}

