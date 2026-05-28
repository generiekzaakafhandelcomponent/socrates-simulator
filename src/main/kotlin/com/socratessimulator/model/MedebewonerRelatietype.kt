package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 0 = Onbekend, 1 = Kind18JaarOfOuder, 2 = OuderOfSchoonouder, 3 = BroerOfZus, 4 = OverigFamilielid, 5 = Kostganger, 6 = Onderhuurder, 7 = ExPartner, 8 = MedeouderVanKind, 9 = Verzorger, 10 = Verzorgde, 11 = Kostendeler, 12 = VoormaligUitkeringdeler, 13 = KindJongerDan18, 14 = Stiefkind, 15 = AangetrouwdKind, 16 = OpaOfOma, 17 = KostgeverOfVerhuurder, 99 = Anders
 * Values: _0,_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12,_13,_14,_15,_16,_17,_99
 */
enum class MedebewonerRelatietype(val value: String) {

    @JsonProperty("0")
    _0("0"),
    @JsonProperty("1")
    _1("1"),
    @JsonProperty("2")
    _2("2"),
    @JsonProperty("3")
    _3("3"),
    @JsonProperty("4")
    _4("4"),
    @JsonProperty("5")
    _5("5"),
    @JsonProperty("6")
    _6("6"),
    @JsonProperty("7")
    _7("7"),
    @JsonProperty("8")
    _8("8"),
    @JsonProperty("9")
    _9("9"),
    @JsonProperty("10")
    _10("10"),
    @JsonProperty("11")
    _11("11"),
    @JsonProperty("12")
    _12("12"),
    @JsonProperty("13")
    _13("13"),
    @JsonProperty("14")
    _14("14"),
    @JsonProperty("15")
    _15("15"),
    @JsonProperty("16")
    _16("16"),
    @JsonProperty("17")
    _17("17"),
    @JsonProperty("99")
    _99("99")
}

