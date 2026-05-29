package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

/**
 * 
 * @param soortAdres
 * @param huisnummerBuitenland De aanduiding van een (deel van een) pand in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Het HUISNUMMER BUITENLAND is inclusief een eventuele huisnummertoevoeging.
 * @param landencodeIso De code van een huidig land of gebiedsdeel conform ISO 3166.Norminstantie: ISO 3166 (Entity, Alpha-2 code)Bron: SGR 16.0Opmerking:LANDENCODE ISO is niet expliciet gedefinieerd in ISO 3166. De omschrijving van dit gegevenselement is dan ook een SUWI-omschrijving.Tabel ISO 3166 Codes for the representation of names of countries and their subdivisionsLANDENCODE ISO dient in principe in ADRES BUITENLAND altijd te worden opgenomen.Indien voor een bepaald land (nog) geen code in ISO 3166 staat vermeld, moet LANDSNAAM worden ingevuld.
 * @param landsnaam De naam van een land of een gebiedsdeel.Norminstantie: UGRBron: SGR 16.0Opmerking:Indien voor een bepaald land (nog) geen LANDENCODE ISO in ISO 3166 vermeld staat, moet LANDSNAAM worden ingevuld.
 * @param locatieomschrijvingBuitenland Een nadere aanduiding bij een buitenlands adres.Norminstantie: UGRBron: SGR 16.0Opmerking:Gebruikmaking van dit gegevenselement kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER BUITENLAND kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.
 * @param postcodeBuitenland Een door de buitenlandse postdienst vastgestelde codering voor een adres in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:De indeling naar staat, departement, provincie of gebiedsdeel is in de POSTCODE BUITENLAND vervat en dus overbodig geworden om apart door te geven in een gegevensuitwisseling. Indien er geen POSTCODE BUITENLAND is, kan echter de aanduiding van staat, departement, provincie of gebiedsdeel opgenomen worden in REGIONAAM BUITENLAND.
 * @param regionaamBuitenland De naam van een gebiedsdeel binnen een land.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een REGIONAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de REGIONAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de REGIONAAM BUITENLAND.Inkortingsregel 2.Kort in de REGIONAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die REGIONAAM BUITENLAND verstrekt.
 * @param straatnaamBuitenland De naam van een straat in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als de STRAATNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de STRAATNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd.Inkortingsregel 1.Verwijder de leestekens punt (.) en apostrof uit de STRAATNAAM BUITENLAND.Inkortingsregel 2.Kort de woorden die een richting aanduiden, indien zij als laatste element en zelfstandig in de STRAATNAAM BUITENLAND voorkomen, in tot een letter.Voorbeelden:North NOuest OSouth SEastside EInkortingsregel 3.Kort de uitgangen of losse woorden die de straataanduiding betreffen zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:strasse strboulevard blvdstreet st.rue rcanal canhavn hInkortingsregel 4.De getallen in Romeinse cijfers worden vervangen door Arabische cijfers.Voorbeelden:XXV 25XIII 13Inkortingsregel 5.De geschreven telwoorden worden vervangen door Arabische cijfers.Voorbeelden:seize 16eight 8Inkortingsregel 6.De voluit geschreven rangtelwoorden worden vervangen door Arabische cijfers plus hun gebruikelijke uitgang.Voorbeeld:sixième 6eseventeenth 17thInkortingsregel 7.Kort de tussenvoegsels zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:an den adde dof oInkortingsregel 8.Kort het eerste bijvoeglijk naamwoord of de eerste titel bij het naambepalende zelfstandige woord tot op de eerste letter in. Dit zoveel mogelijk volgens de NEN 5825 en anders naar eigen inzicht.Voorbeelden:Comte CGraf GGreat GQueen QGeneral GInkortingsregel 9.Pas inkortingsregel 8 opnieuw toe, maar nu op het tweede bijvoeglijk naamwoord of de tweede titel.Inkortingsregel 10.Vraag advies aan degene die de STRAATNAAM BUITENLAND heeft verstrekt.
 * @param woonplaatsnaamBuitenland De naam van een woonplaats in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een WOONPLAATSNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de WOONPLAATSNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de WOONPLAATSNAAM BUITENLAND.Inkortingsregel 2.Kort in de WOONPLAATSNAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die WOONPLAATSNAAM BUITENLAND verstrekt.
 */
data class StraatadresBuitenland(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("soortAdres", required = true) override val soortAdres: SoortAdres,

    @field:Min(0)
    @field:Max(2147483647)
    @Schema(
        example = "null",
        description = "De aanduiding van een (deel van een) pand in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Het HUISNUMMER BUITENLAND is inclusief een eventuele huisnummertoevoeging."
    )
    @get:JsonProperty("huisnummerBuitenland") override val huisnummerBuitenland: Int? = null,

    @field:Pattern(regexp = "^[A-Z]{2}$")
    @Schema(
        example = "null",
        description = "De code van een huidig land of gebiedsdeel conform ISO 3166.Norminstantie: ISO 3166 (Entity, Alpha-2 code)Bron: SGR 16.0Opmerking:LANDENCODE ISO is niet expliciet gedefinieerd in ISO 3166. De omschrijving van dit gegevenselement is dan ook een SUWI-omschrijving.Tabel ISO 3166 Codes for the representation of names of countries and their subdivisionsLANDENCODE ISO dient in principe in ADRES BUITENLAND altijd te worden opgenomen.Indien voor een bepaald land (nog) geen code in ISO 3166 staat vermeld, moet LANDSNAAM worden ingevuld."
    )
    @get:JsonProperty("landencodeIso") override val landencodeIso: String? = null,

    @Schema(
        example = "null",
        description = "De naam van een land of een gebiedsdeel.Norminstantie: UGRBron: SGR 16.0Opmerking:Indien voor een bepaald land (nog) geen LANDENCODE ISO in ISO 3166 vermeld staat, moet LANDSNAAM worden ingevuld."
    )
    @get:JsonProperty("landsnaam") override val landsnaam: String? = null,

    @field:Size(min = 1, max = 35)
    @Schema(
        example = "null",
        description = "Een nadere aanduiding bij een buitenlands adres.Norminstantie: UGRBron: SGR 16.0Opmerking:Gebruikmaking van dit gegevenselement kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER BUITENLAND kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden."
    )
    @get:JsonProperty("locatieomschrijvingBuitenland") override val locatieomschrijvingBuitenland: String? = null,

    @field:Size(min = 1, max = 35)
    @Schema(
        example = "null",
        description = "Een door de buitenlandse postdienst vastgestelde codering voor een adres in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:De indeling naar staat, departement, provincie of gebiedsdeel is in de POSTCODE BUITENLAND vervat en dus overbodig geworden om apart door te geven in een gegevensuitwisseling. Indien er geen POSTCODE BUITENLAND is, kan echter de aanduiding van staat, departement, provincie of gebiedsdeel opgenomen worden in REGIONAAM BUITENLAND."
    )
    @get:JsonProperty("postcodeBuitenland") override val postcodeBuitenland: String? = null,

    @field:Size(min = 1, max = 35)
    @Schema(
        example = "null",
        description = "De naam van een gebiedsdeel binnen een land.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een REGIONAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de REGIONAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de REGIONAAM BUITENLAND.Inkortingsregel 2.Kort in de REGIONAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die REGIONAAM BUITENLAND verstrekt."
    )
    @get:JsonProperty("regionaamBuitenland") override val regionaamBuitenland: String? = null,

    @field:Size(min = 1, max = 35)
    @Schema(
        example = "null",
        description = "De naam van een straat in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als de STRAATNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de STRAATNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd.Inkortingsregel 1.Verwijder de leestekens punt (.) en apostrof uit de STRAATNAAM BUITENLAND.Inkortingsregel 2.Kort de woorden die een richting aanduiden, indien zij als laatste element en zelfstandig in de STRAATNAAM BUITENLAND voorkomen, in tot een letter.Voorbeelden:North NOuest OSouth SEastside EInkortingsregel 3.Kort de uitgangen of losse woorden die de straataanduiding betreffen zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:strasse strboulevard blvdstreet st.rue rcanal canhavn hInkortingsregel 4.De getallen in Romeinse cijfers worden vervangen door Arabische cijfers.Voorbeelden:XXV 25XIII 13Inkortingsregel 5.De geschreven telwoorden worden vervangen door Arabische cijfers.Voorbeelden:seize 16eight 8Inkortingsregel 6.De voluit geschreven rangtelwoorden worden vervangen door Arabische cijfers plus hun gebruikelijke uitgang.Voorbeeld:sixième 6eseventeenth 17thInkortingsregel 7.Kort de tussenvoegsels zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:an den adde dof oInkortingsregel 8.Kort het eerste bijvoeglijk naamwoord of de eerste titel bij het naambepalende zelfstandige woord tot op de eerste letter in. Dit zoveel mogelijk volgens de NEN 5825 en anders naar eigen inzicht.Voorbeelden:Comte CGraf GGreat GQueen QGeneral GInkortingsregel 9.Pas inkortingsregel 8 opnieuw toe, maar nu op het tweede bijvoeglijk naamwoord of de tweede titel.Inkortingsregel 10.Vraag advies aan degene die de STRAATNAAM BUITENLAND heeft verstrekt."
    )
    @get:JsonProperty("straatnaamBuitenland") override val straatnaamBuitenland: String? = null,

    @field:Size(min = 1, max = 40)
    @Schema(
        example = "null",
        description = "De naam van een woonplaats in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een WOONPLAATSNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de WOONPLAATSNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de WOONPLAATSNAAM BUITENLAND.Inkortingsregel 2.Kort in de WOONPLAATSNAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die WOONPLAATSNAAM BUITENLAND verstrekt."
    )
    @get:JsonProperty("woonplaatsnaamBuitenland") override val woonplaatsnaamBuitenland: String? = null
) : Adres

