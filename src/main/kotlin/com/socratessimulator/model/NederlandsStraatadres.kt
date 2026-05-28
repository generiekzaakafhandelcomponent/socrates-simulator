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
 * @param huisnummer De numerieke aanduiding zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Huisnummer
 * @param postcode De officiële codering van TNT Post voor een Nederlands postadres, bestaande uit een numeriek deel en een alfabetisch deel.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - PostcodeOpmerking:-360 Het POSTCODE numerieke deel - bestaande uit vier cijfers - (formaat N4), is het deel van de POSTCODE dat een woonplaats, een wijk in een woonplaats, een groep postbussen in een woonplaats of een groep ANTWOORDNUMMERS in een woonplaats aangeeft. (Bron: STUCON)Het POSTCODE alfabetische deel - bestaande uit twee hoofdletters - (formaat A2), is het deel van de POSTCODE dat binnen een woonplaats of een wijk in een woonplaats, betrekking heeft op een groep van ongeveer 25 woningen, bedrijfspanden of iets dergelijks, op een aantal postbussen of op een aantal ANTWOORDNUMMERS. (Bron: UGR)Alle bestaanbare waardes voor POSTCODE zijn te vinden in de TNT postcodetabel. Deze is op te vragen bij de TNT Post.Bron: SGR 16.0
 * @param straatnaam De officiële door de gemeente vastgestelde naam van een straat.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - StraatnaamOpmerkingen:-360 Het waardebereik van dit gegevenselement is te vinden in de PTT-postcodetabel. Deze is op te vragen bij de PTT.De inkortingsregels uit bijlage A van de NEN 5825 zijn van toepassing op straatnamen van meer dan 24 posities. De inkortingsregels zijn in de PTT-postcodetabel reeds toegepast.Bron: SGR 16.0
 * @param woonplaatsnaam De naam van een door het bevoegde gemeentelijke orgaan als zodanig aangewezen gedeelte van het gemeentelijk grondgebied.Norminstantie: BAG/GBABron: SGR 16.0
 * @param aanduidingBijHuisnummer De aanduiding die wordt gebruikt voor adressen die niet zijn voorzien van de gebruikelijke straatnaam en huisnummeraanduidingen.Bron: SGR 16.0Norminstantie: GBA
 * @param huisletter Een alfabetisch teken achter het huisnummer zoals dit door het gemeentebestuur is toegekend.Bron: SGR 16.0Norminstantie: GBA
 * @param huisnummertoevoeging De huisnummertoevoeging zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - HuisnummertoevoegingOpmerking:Bij de feitelijke toekenning van identificatiegegevens aan een object in aanvulling op het huisnummer kan door gemeenten gebruik gemaakt worden van de elementen  huisletter  en  huisnummertoevoeging . In het element huisnummertoevoeging van deze norm worden deze door de gemeente toegekende elementen opgenomen.Bron: SGR 16.0
 * @param locatieomschrijving Een nadere aanduiding bij de STRAATNAAM en - indien aanwezig - het HUISNUMMER of bij Postbus en POSTBUSNUMMER, dan wel Antwoordnummer en ANTWOORDNUMMER.Bron: SGR 16.0, gebaseerd op NEN 5825:2002 - LocatieomschrijvingOpmerkingen:Gebruikmaking van de LOCATIEOMSCHRIJVING kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.Voorbeelden van toevoegingen die in de LOCATIEOMSCHRIJVING opgenomen kunnen worden, zijn:poste restantewoonboot Mariannewoonwagen Bambiflat Orionkamer 412appartement V 113kelder, zolder, souterrain, enz.1e verdieping, 2e verdieping, enz.aanduiding ten behoeve van horizontale verdeling, zoals:linksmidden dwarsrechtsvoormidden evenwijdigachtervoor linksmidden linksachter linksvoor middenmidden middenachter midden2. De waarde poste restante voor een LOCATIEOMSCHRIJVING is niet toegestaan in een DOMICILIE-ADRES.3. De toelichting van LOCATIEBESCHRIJVING volgens BRP is een geheel of gedeeltelijke omschrijving van de ligging van een object. Als locatiebeschrijving is niet toegestaan een  postbus (postbox) en een poste restante.Bron: SGR 16.0
 */
data class NederlandsStraatadres(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("soortAdres", required = true) val soortAdres: SoortAdres,

    @get:Min(0)
    @get:Max(2147483647)
    @Schema(
        example = "null",
        required = true,
        description = "De numerieke aanduiding zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Huisnummer"
    )
    @get:JsonProperty("huisnummer", required = true) val huisnummer: kotlin.Int,

    @get:Pattern(regexp = "^[1-9][0-9]{3} ?[a-zA-Z]{2}$")
    @Schema(
        example = "null",
        required = true,
        description = "De officiële codering van TNT Post voor een Nederlands postadres, bestaande uit een numeriek deel en een alfabetisch deel.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - PostcodeOpmerking:-360 Het POSTCODE numerieke deel - bestaande uit vier cijfers - (formaat N4), is het deel van de POSTCODE dat een woonplaats, een wijk in een woonplaats, een groep postbussen in een woonplaats of een groep ANTWOORDNUMMERS in een woonplaats aangeeft. (Bron: STUCON)Het POSTCODE alfabetische deel - bestaande uit twee hoofdletters - (formaat A2), is het deel van de POSTCODE dat binnen een woonplaats of een wijk in een woonplaats, betrekking heeft op een groep van ongeveer 25 woningen, bedrijfspanden of iets dergelijks, op een aantal postbussen of op een aantal ANTWOORDNUMMERS. (Bron: UGR)Alle bestaanbare waardes voor POSTCODE zijn te vinden in de TNT postcodetabel. Deze is op te vragen bij de TNT Post.Bron: SGR 16.0"
    )
    @get:JsonProperty("postcode", required = true) val postcode: String,

    @get:Pattern(regexp = "^[\\p{L}\\p{M}\\-'\\.,/\\s]{1,24}$")
    @Schema(
        example = "null",
        required = true,
        description = "De officiële door de gemeente vastgestelde naam van een straat.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - StraatnaamOpmerkingen:-360 Het waardebereik van dit gegevenselement is te vinden in de PTT-postcodetabel. Deze is op te vragen bij de PTT.De inkortingsregels uit bijlage A van de NEN 5825 zijn van toepassing op straatnamen van meer dan 24 posities. De inkortingsregels zijn in de PTT-postcodetabel reeds toegepast.Bron: SGR 16.0"
    )
    @get:JsonProperty("straatnaam", required = true) val straatnaam: String,

    @get:Pattern(regexp = "^[\\p{L}\\p{M}\\d\\-'\\.\\s]{1,40}$")
    @Schema(
        example = "null",
        required = true,
        description = "De naam van een door het bevoegde gemeentelijke orgaan als zodanig aangewezen gedeelte van het gemeentelijk grondgebied.Norminstantie: BAG/GBABron: SGR 16.0"
    )
    @get:JsonProperty("woonplaatsnaam", required = true) val woonplaatsnaam: String,

    @Schema(
        example = "null",
        description = "De aanduiding die wordt gebruikt voor adressen die niet zijn voorzien van de gebruikelijke straatnaam en huisnummeraanduidingen.Bron: SGR 16.0Norminstantie: GBA"
    )
    @get:JsonProperty("aanduidingBijHuisnummer") val aanduidingBijHuisnummer: String? = null,

    @get:Pattern(regexp = "^[A-Za-z]$")
    @Schema(
        example = "null",
        description = "Een alfabetisch teken achter het huisnummer zoals dit door het gemeentebestuur is toegekend.Bron: SGR 16.0Norminstantie: GBA"
    )
    @get:JsonProperty("huisletter") val huisletter: String? = null,

    @get:Size(min = 1, max = 4)
    @Schema(
        example = "null",
        description = "De huisnummertoevoeging zoals deze door de gemeente aan het object is toegekend.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - HuisnummertoevoegingOpmerking:Bij de feitelijke toekenning van identificatiegegevens aan een object in aanvulling op het huisnummer kan door gemeenten gebruik gemaakt worden van de elementen  huisletter  en  huisnummertoevoeging . In het element huisnummertoevoeging van deze norm worden deze door de gemeente toegekende elementen opgenomen.Bron: SGR 16.0"
    )
    @get:JsonProperty("huisnummertoevoeging") val huisnummertoevoeging: String? = null,

    @get:Pattern(regexp = "^[\\p{L}\\p{M}\\d\\-'\\.\\s]{1,35}$")
    @Schema(
        example = "null",
        description = "Een nadere aanduiding bij de STRAATNAAM en - indien aanwezig - het HUISNUMMER of bij Postbus en POSTBUSNUMMER, dan wel Antwoordnummer en ANTWOORDNUMMER.Bron: SGR 16.0, gebaseerd op NEN 5825:2002 - LocatieomschrijvingOpmerkingen:Gebruikmaking van de LOCATIEOMSCHRIJVING kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.Voorbeelden van toevoegingen die in de LOCATIEOMSCHRIJVING opgenomen kunnen worden, zijn:poste restantewoonboot Mariannewoonwagen Bambiflat Orionkamer 412appartement V 113kelder, zolder, souterrain, enz.1e verdieping, 2e verdieping, enz.aanduiding ten behoeve van horizontale verdeling, zoals:linksmidden dwarsrechtsvoormidden evenwijdigachtervoor linksmidden linksachter linksvoor middenmidden middenachter midden2. De waarde poste restante voor een LOCATIEOMSCHRIJVING is niet toegestaan in een DOMICILIE-ADRES.3. De toelichting van LOCATIEBESCHRIJVING volgens BRP is een geheel of gedeeltelijke omschrijving van de ligging van een object. Als locatiebeschrijving is niet toegestaan een  postbus (postbox) en een poste restante.Bron: SGR 16.0"
    )
    @get:JsonProperty("locatieomschrijving") val locatieomschrijving: String? = null
)

