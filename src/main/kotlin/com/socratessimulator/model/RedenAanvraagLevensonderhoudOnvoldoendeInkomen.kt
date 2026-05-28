package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 1 = IkHebGeenWerkMeer, 2 = IkHebWelInkomstenMaarTeLaag, 3 = UitkeringGeenBijstandStopgezet, 4 = BijstandsuitkeringStopgezet, 5 = BijstandsaanvraagAfgewezenOfNietInBehandeling, 6 = AlimentatieGestoptOfVerlaagd, 7 = StudiefinancieringGestopt, 8 = InStakingOfUitgeslotenVoorWerk, 9 = VanSpaargeldGeleefd, 10 = VrijNaGevangenisstraf, 11 = AndereReden
 * Values: _1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11
 */
enum class RedenAanvraagLevensonderhoudOnvoldoendeInkomen(val value: String) {

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
    _11("11")
}

