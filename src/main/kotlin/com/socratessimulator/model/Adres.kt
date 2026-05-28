package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param soortAdres
 * @param postbusnummer De numerieke aanduiding zoals deze door TNT Post is vastgesteld voor een Nederlandse POSTBUS.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Postbusnummer
 * @param postcode De officiële codering van TNT Post voor een Nederlands postadres, bestaande uit een numeriek deel en een alfabetisch deel.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - PostcodeOpmerking:-360 Het POSTCODE numerieke deel - bestaande uit vier cijfers - (formaat N4), is het deel van de POSTCODE dat een woonplaats, een wijk in een woonplaats, een groep postbussen in een woonplaats of een groep ANTWOORDNUMMERS in een woonplaats aangeeft. (Bron: STUCON)Het POSTCODE alfabetische deel - bestaande uit twee hoofdletters - (formaat A2), is het deel van de POSTCODE dat binnen een woonplaats of een wijk in een woonplaats, betrekking heeft op een groep van ongeveer 25 woningen, bedrijfspanden of iets dergelijks, op een aantal postbussen of op een aantal ANTWOORDNUMMERS. (Bron: UGR)Alle bestaanbare waardes voor POSTCODE zijn te vinden in de TNT postcodetabel. Deze is op te vragen bij de TNT Post.Bron: SGR 16.0
 * @param woonplaatsnaam De naam van een door het bevoegde gemeentelijke orgaan als zodanig aangewezen gedeelte van het gemeentelijk grondgebied.Norminstantie: BAG/GBABron: SGR 16.0
 * @param huisnummer De numerieke aanduiding zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Huisnummer
 * @param straatnaam De officiële door de gemeente vastgestelde naam van een straat.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - StraatnaamOpmerkingen:-360 Het waardebereik van dit gegevenselement is te vinden in de PTT-postcodetabel. Deze is op te vragen bij de PTT.De inkortingsregels uit bijlage A van de NEN 5825 zijn van toepassing op straatnamen van meer dan 24 posities. De inkortingsregels zijn in de PTT-postcodetabel reeds toegepast.Bron: SGR 16.0
 * @param locatieomschrijving Een nadere aanduiding bij de STRAATNAAM en - indien aanwezig - het HUISNUMMER of bij Postbus en POSTBUSNUMMER, dan wel Antwoordnummer en ANTWOORDNUMMER.Bron: SGR 16.0, gebaseerd op NEN 5825:2002 - LocatieomschrijvingOpmerkingen:Gebruikmaking van de LOCATIEOMSCHRIJVING kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.Voorbeelden van toevoegingen die in de LOCATIEOMSCHRIJVING opgenomen kunnen worden, zijn:poste restantewoonboot Mariannewoonwagen Bambiflat Orionkamer 412appartement V 113kelder, zolder, souterrain, enz.1e verdieping, 2e verdieping, enz.aanduiding ten behoeve van horizontale verdeling, zoals:linksmidden dwarsrechtsvoormidden evenwijdigachtervoor linksmidden linksachter linksvoor middenmidden middenachter midden2. De waarde poste restante voor een LOCATIEOMSCHRIJVING is niet toegestaan in een DOMICILIE-ADRES.3. De toelichting van LOCATIEBESCHRIJVING volgens BRP is een geheel of gedeeltelijke omschrijving van de ligging van een object. Als locatiebeschrijving is niet toegestaan een  postbus (postbox) en een poste restante.Bron: SGR 16.0
 * @param aanduidingBijHuisnummer De aanduiding die wordt gebruikt voor adressen die niet zijn voorzien van de gebruikelijke straatnaam en huisnummeraanduidingen.Bron: SGR 16.0Norminstantie: GBA
 * @param huisletter Een alfabetisch teken achter het huisnummer zoals dit door het gemeentebestuur is toegekend.Bron: SGR 16.0Norminstantie: GBA
 * @param huisnummertoevoeging De huisnummertoevoeging zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - HuisnummertoevoegingOpmerking:Bij de feitelijke toekenning van identificatiegegevens aan een object in aanvulling op het huisnummer kan door gemeenten gebruik gemaakt worden van de elementen  huisletter  en  huisnummertoevoeging . In het element huisnummertoevoeging van deze norm worden deze door de gemeente toegekende elementen opgenomen.Bron: SGR 16.0
 * @param huisnummerBuitenland De aanduiding van een (deel van een) pand in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Het HUISNUMMER BUITENLAND is inclusief een eventuele huisnummertoevoeging.
 * @param landencodeIso De code van een huidig land of gebiedsdeel conform ISO 3166.Norminstantie: ISO 3166 (Entity, Alpha-2 code)Bron: SGR 16.0Opmerking:LANDENCODE ISO is niet expliciet gedefinieerd in ISO 3166. De omschrijving van dit gegevenselement is dan ook een SUWI-omschrijving.Tabel ISO 3166 Codes for the representation of names of countries and their subdivisionsLANDENCODE ISO dient in principe in ADRES BUITENLAND altijd te worden opgenomen.Indien voor een bepaald land (nog) geen code in ISO 3166 staat vermeld, moet LANDSNAAM worden ingevuld.
 * @param landsnaam De naam van een land of een gebiedsdeel.Norminstantie: UGRBron: SGR 16.0Opmerking:Indien voor een bepaald land (nog) geen LANDENCODE ISO in ISO 3166 vermeld staat, moet LANDSNAAM worden ingevuld.
 * @param locatieomschrijvingBuitenland Een nadere aanduiding bij een buitenlands adres.Norminstantie: UGRBron: SGR 16.0Opmerking:Gebruikmaking van dit gegevenselement kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER BUITENLAND kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.
 * @param postcodeBuitenland Een door de buitenlandse postdienst vastgestelde codering voor een adres in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:De indeling naar staat, departement, provincie of gebiedsdeel is in de POSTCODE BUITENLAND vervat en dus overbodig geworden om apart door te geven in een gegevensuitwisseling. Indien er geen POSTCODE BUITENLAND is, kan echter de aanduiding van staat, departement, provincie of gebiedsdeel opgenomen worden in REGIONAAM BUITENLAND.
 * @param regionaamBuitenland De naam van een gebiedsdeel binnen een land.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een REGIONAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de REGIONAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de REGIONAAM BUITENLAND.Inkortingsregel 2.Kort in de REGIONAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die REGIONAAM BUITENLAND verstrekt.
 * @param straatnaamBuitenland De naam van een straat in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als de STRAATNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de STRAATNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd.Inkortingsregel 1.Verwijder de leestekens punt (.) en apostrof uit de STRAATNAAM BUITENLAND.Inkortingsregel 2.Kort de woorden die een richting aanduiden, indien zij als laatste element en zelfstandig in de STRAATNAAM BUITENLAND voorkomen, in tot een letter.Voorbeelden:North NOuest OSouth SEastside EInkortingsregel 3.Kort de uitgangen of losse woorden die de straataanduiding betreffen zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:strasse strboulevard blvdstreet st.rue rcanal canhavn hInkortingsregel 4.De getallen in Romeinse cijfers worden vervangen door Arabische cijfers.Voorbeelden:XXV 25XIII 13Inkortingsregel 5.De geschreven telwoorden worden vervangen door Arabische cijfers.Voorbeelden:seize 16eight 8Inkortingsregel 6.De voluit geschreven rangtelwoorden worden vervangen door Arabische cijfers plus hun gebruikelijke uitgang.Voorbeeld:sixième 6eseventeenth 17thInkortingsregel 7.Kort de tussenvoegsels zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:an den adde dof oInkortingsregel 8.Kort het eerste bijvoeglijk naamwoord of de eerste titel bij het naambepalende zelfstandige woord tot op de eerste letter in. Dit zoveel mogelijk volgens de NEN 5825 en anders naar eigen inzicht.Voorbeelden:Comte CGraf GGreat GQueen QGeneral GInkortingsregel 9.Pas inkortingsregel 8 opnieuw toe, maar nu op het tweede bijvoeglijk naamwoord of de tweede titel.Inkortingsregel 10.Vraag advies aan degene die de STRAATNAAM BUITENLAND heeft verstrekt.
 * @param woonplaatsnaamBuitenland De naam van een woonplaats in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een WOONPLAATSNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de WOONPLAATSNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de WOONPLAATSNAAM BUITENLAND.Inkortingsregel 2.Kort in de WOONPLAATSNAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die WOONPLAATSNAAM BUITENLAND verstrekt.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "soortAdres", visible = true)
@JsonSubTypes(
    JsonSubTypes.Type(value = NederlandsPostbusadres::class, name = "NederlandsPostbusadres"),
    JsonSubTypes.Type(value = NederlandsStraatadres::class, name = "NederlandsStraatadres"),
    JsonSubTypes.Type(value = StraatadresBuitenland::class, name = "StraatadresBuitenland")
)

interface Adres {
    @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
    val soortAdres: SoortAdres

    @get:Schema(
        example = "null",
        requiredMode = Schema.RequiredMode.REQUIRED,
        description = "De numerieke aanduiding zoals deze door TNT Post is vastgesteld voor een Nederlandse POSTBUS.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Postbusnummer"
    )
    val postbusnummer: Int

    @get:Schema(
        example = "null",
        requiredMode = Schema.RequiredMode.REQUIRED,
        description = "De officiële codering van TNT Post voor een Nederlands postadres, bestaande uit een numeriek deel en een alfabetisch deel.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - PostcodeOpmerking:-360 Het POSTCODE numerieke deel - bestaande uit vier cijfers - (formaat N4), is het deel van de POSTCODE dat een woonplaats, een wijk in een woonplaats, een groep postbussen in een woonplaats of een groep ANTWOORDNUMMERS in een woonplaats aangeeft. (Bron: STUCON)Het POSTCODE alfabetische deel - bestaande uit twee hoofdletters - (formaat A2), is het deel van de POSTCODE dat binnen een woonplaats of een wijk in een woonplaats, betrekking heeft op een groep van ongeveer 25 woningen, bedrijfspanden of iets dergelijks, op een aantal postbussen of op een aantal ANTWOORDNUMMERS. (Bron: UGR)Alle bestaanbare waardes voor POSTCODE zijn te vinden in de TNT postcodetabel. Deze is op te vragen bij de TNT Post.Bron: SGR 16.0"
    )
    val postcode: String

    @get:Schema(
        example = "null",
        requiredMode = Schema.RequiredMode.REQUIRED,
        description = "De naam van een door het bevoegde gemeentelijke orgaan als zodanig aangewezen gedeelte van het gemeentelijk grondgebied.Norminstantie: BAG/GBABron: SGR 16.0"
    )
    val woonplaatsnaam: String

    @get:Schema(
        example = "null",
        requiredMode = Schema.RequiredMode.REQUIRED,
        description = "De numerieke aanduiding zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Huisnummer"
    )
    val huisnummer: Int

    @get:Schema(
        example = "null",
        requiredMode = Schema.RequiredMode.REQUIRED,
        description = "De officiële door de gemeente vastgestelde naam van een straat.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - StraatnaamOpmerkingen:-360 Het waardebereik van dit gegevenselement is te vinden in de PTT-postcodetabel. Deze is op te vragen bij de PTT.De inkortingsregels uit bijlage A van de NEN 5825 zijn van toepassing op straatnamen van meer dan 24 posities. De inkortingsregels zijn in de PTT-postcodetabel reeds toegepast.Bron: SGR 16.0"
    )
    val straatnaam: String

    @get:Schema(
        example = "null",
        description = "Een nadere aanduiding bij de STRAATNAAM en - indien aanwezig - het HUISNUMMER of bij Postbus en POSTBUSNUMMER, dan wel Antwoordnummer en ANTWOORDNUMMER.Bron: SGR 16.0, gebaseerd op NEN 5825:2002 - LocatieomschrijvingOpmerkingen:Gebruikmaking van de LOCATIEOMSCHRIJVING kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.Voorbeelden van toevoegingen die in de LOCATIEOMSCHRIJVING opgenomen kunnen worden, zijn:poste restantewoonboot Mariannewoonwagen Bambiflat Orionkamer 412appartement V 113kelder, zolder, souterrain, enz.1e verdieping, 2e verdieping, enz.aanduiding ten behoeve van horizontale verdeling, zoals:linksmidden dwarsrechtsvoormidden evenwijdigachtervoor linksmidden linksachter linksvoor middenmidden middenachter midden2. De waarde poste restante voor een LOCATIEOMSCHRIJVING is niet toegestaan in een DOMICILIE-ADRES.3. De toelichting van LOCATIEBESCHRIJVING volgens BRP is een geheel of gedeeltelijke omschrijving van de ligging van een object. Als locatiebeschrijving is niet toegestaan een  postbus (postbox) en een poste restante.Bron: SGR 16.0"
    )
    val locatieomschrijving: String?

    @get:Schema(
        example = "null",
        description = "De aanduiding die wordt gebruikt voor adressen die niet zijn voorzien van de gebruikelijke straatnaam en huisnummeraanduidingen.Bron: SGR 16.0Norminstantie: GBA"
    )
    val aanduidingBijHuisnummer: String?

    @get:Schema(
        example = "null",
        description = "Een alfabetisch teken achter het huisnummer zoals dit door het gemeentebestuur is toegekend.Bron: SGR 16.0Norminstantie: GBA"
    )
    val huisletter: String?

    @get:Schema(
        example = "null",
        description = "De huisnummertoevoeging zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - HuisnummertoevoegingOpmerking:Bij de feitelijke toekenning van identificatiegegevens aan een object in aanvulling op het huisnummer kan door gemeenten gebruik gemaakt worden van de elementen  huisletter  en  huisnummertoevoeging . In het element huisnummertoevoeging van deze norm worden deze door de gemeente toegekende elementen opgenomen.Bron: SGR 16.0"
    )
    val huisnummertoevoeging: String?

    @get:Schema(
        example = "null",
        description = "De aanduiding van een (deel van een) pand in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Het HUISNUMMER BUITENLAND is inclusief een eventuele huisnummertoevoeging."
    )
    val huisnummerBuitenland: Int?

    @get:Schema(
        example = "null",
        description = "De code van een huidig land of gebiedsdeel conform ISO 3166.Norminstantie: ISO 3166 (Entity, Alpha-2 code)Bron: SGR 16.0Opmerking:LANDENCODE ISO is niet expliciet gedefinieerd in ISO 3166. De omschrijving van dit gegevenselement is dan ook een SUWI-omschrijving.Tabel ISO 3166 Codes for the representation of names of countries and their subdivisionsLANDENCODE ISO dient in principe in ADRES BUITENLAND altijd te worden opgenomen.Indien voor een bepaald land (nog) geen code in ISO 3166 staat vermeld, moet LANDSNAAM worden ingevuld."
    )
    val landencodeIso: String?

    @get:Schema(
        example = "null",
        description = "De naam van een land of een gebiedsdeel.Norminstantie: UGRBron: SGR 16.0Opmerking:Indien voor een bepaald land (nog) geen LANDENCODE ISO in ISO 3166 vermeld staat, moet LANDSNAAM worden ingevuld."
    )
    val landsnaam: String?

    @get:Schema(
        example = "null",
        description = "Een nadere aanduiding bij een buitenlands adres.Norminstantie: UGRBron: SGR 16.0Opmerking:Gebruikmaking van dit gegevenselement kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER BUITENLAND kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden."
    )
    val locatieomschrijvingBuitenland: String?

    @get:Schema(
        example = "null",
        description = "Een door de buitenlandse postdienst vastgestelde codering voor een adres in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:De indeling naar staat, departement, provincie of gebiedsdeel is in de POSTCODE BUITENLAND vervat en dus overbodig geworden om apart door te geven in een gegevensuitwisseling. Indien er geen POSTCODE BUITENLAND is, kan echter de aanduiding van staat, departement, provincie of gebiedsdeel opgenomen worden in REGIONAAM BUITENLAND."
    )
    val postcodeBuitenland: String?

    @get:Schema(
        example = "null",
        description = "De naam van een gebiedsdeel binnen een land.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een REGIONAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de REGIONAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de REGIONAAM BUITENLAND.Inkortingsregel 2.Kort in de REGIONAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde REGIONAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die REGIONAAM BUITENLAND verstrekt."
    )
    val regionaamBuitenland: String?

    @get:Schema(
        example = "null",
        description = "De naam van een straat in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als de STRAATNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de STRAATNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd.Inkortingsregel 1.Verwijder de leestekens punt (.) en apostrof uit de STRAATNAAM BUITENLAND.Inkortingsregel 2.Kort de woorden die een richting aanduiden, indien zij als laatste element en zelfstandig in de STRAATNAAM BUITENLAND voorkomen, in tot een letter.Voorbeelden:North NOuest OSouth SEastside EInkortingsregel 3.Kort de uitgangen of losse woorden die de straataanduiding betreffen zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:strasse strboulevard blvdstreet st.rue rcanal canhavn hInkortingsregel 4.De getallen in Romeinse cijfers worden vervangen door Arabische cijfers.Voorbeelden:XXV 25XIII 13Inkortingsregel 5.De geschreven telwoorden worden vervangen door Arabische cijfers.Voorbeelden:seize 16eight 8Inkortingsregel 6.De voluit geschreven rangtelwoorden worden vervangen door Arabische cijfers plus hun gebruikelijke uitgang.Voorbeeld:sixième 6eseventeenth 17thInkortingsregel 7.Kort de tussenvoegsels zoveel mogelijk volgens de NEN 5825 in en anders naar eigen inzicht.Voorbeelden:an den adde dof oInkortingsregel 8.Kort het eerste bijvoeglijk naamwoord of de eerste titel bij het naambepalende zelfstandige woord tot op de eerste letter in. Dit zoveel mogelijk volgens de NEN 5825 en anders naar eigen inzicht.Voorbeelden:Comte CGraf GGreat GQueen QGeneral GInkortingsregel 9.Pas inkortingsregel 8 opnieuw toe, maar nu op het tweede bijvoeglijk naamwoord of de tweede titel.Inkortingsregel 10.Vraag advies aan degene die de STRAATNAAM BUITENLAND heeft verstrekt."
    )
    val straatnaamBuitenland: String?

    @get:Schema(
        example = "null",
        description = "De naam van een woonplaats in het buitenland.Norminstantie: UGRBron: SGR 16.0Opmerking:Inkortingsregels:Als een WOONPLAATSNAAM BUITENLAND langer is dan 24 posities, moet de eerste inkortingsregel worden toegepast. Blijkt na toepassing daarvan de WOONPLAATSNAAM BUITENLAND nog steeds de 24 posities te overschrijden, dan treedt de tweede inkortingsregel in werking, en zo vervolgend totdat het aantal posities nog ten hoogste 24 bedraagt of alle inkortingsregels zijn gehanteerd. Tenzij anders vermeld, worden de inkortingsregels van rechts beginnend toegepast.Inkortingsregel 1.Verwijder leestekens uit de WOONPLAATSNAAM BUITENLAND.Inkortingsregel 2.Kort in de WOONPLAATSNAAM BUITENLAND, naar eigen inzicht, de tussenvoegsels in.Inkortingsregel 3.Kort het eerste bijvoeglijk naamwoord, en indien nodig de daarop volgende bijvoeglijke naamwoorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 4.Kort het eerste woord na de tussenvoegsel, en indien nodig de daaropvolgende woorden, van een samengestelde WOONPLAATSNAAM BUITENLAND in tot de eerste letter van het woord, tenzij het betreffende woord al een inkorting is.Inkortingsregel 5.Vraag advies aan degene, die WOONPLAATSNAAM BUITENLAND verstrekt."
    )
    val woonplaatsnaamBuitenland: String?


}

