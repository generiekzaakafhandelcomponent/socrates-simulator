package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param soortAdres
 * @param postbusnummer De numerieke aanduiding zoals deze door TNT Post is vastgesteld voor een Nederlandse POSTBUS.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Postbusnummer
 * @param postcode De officiële codering van TNT Post voor een Nederlands postadres, bestaande uit een numeriek deel en een alfabetisch deel.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - PostcodeOpmerking:-360 Het POSTCODE numerieke deel - bestaande uit vier cijfers - (formaat N4), is het deel van de POSTCODE dat een woonplaats, een wijk in een woonplaats, een groep postbussen in een woonplaats of een groep ANTWOORDNUMMERS in een woonplaats aangeeft. (Bron: STUCON)Het POSTCODE alfabetische deel - bestaande uit twee hoofdletters - (formaat A2), is het deel van de POSTCODE dat binnen een woonplaats of een wijk in een woonplaats, betrekking heeft op een groep van ongeveer 25 woningen, bedrijfspanden of iets dergelijks, op een aantal postbussen of op een aantal ANTWOORDNUMMERS. (Bron: UGR)Alle bestaanbare waardes voor POSTCODE zijn te vinden in de TNT postcodetabel. Deze is op te vragen bij de TNT Post.Bron: SGR 16.0
 * @param woonplaatsnaam De naam van een door het bevoegde gemeentelijke orgaan als zodanig aangewezen gedeelte van het gemeentelijk grondgebied.Norminstantie: BAG/GBABron: SGR 16.0
 * @param locatieomschrijving Een nadere aanduiding bij de STRAATNAAM en - indien aanwezig - het HUISNUMMER of bij Postbus en POSTBUSNUMMER, dan wel Antwoordnummer en ANTWOORDNUMMER.Bron: SGR 16.0, gebaseerd op NEN 5825:2002 - LocatieomschrijvingOpmerkingen:Gebruikmaking van de LOCATIEOMSCHRIJVING kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.Voorbeelden van toevoegingen die in de LOCATIEOMSCHRIJVING opgenomen kunnen worden, zijn:poste restantewoonboot Mariannewoonwagen Bambiflat Orionkamer 412appartement V 113kelder, zolder, souterrain, enz.1e verdieping, 2e verdieping, enz.aanduiding ten behoeve van horizontale verdeling, zoals:linksmidden dwarsrechtsvoormidden evenwijdigachtervoor linksmidden linksachter linksvoor middenmidden middenachter midden2. De waarde poste restante voor een LOCATIEOMSCHRIJVING is niet toegestaan in een DOMICILIE-ADRES.3. De toelichting van LOCATIEBESCHRIJVING volgens BRP is een geheel of gedeeltelijke omschrijving van de ligging van een object. Als locatiebeschrijving is niet toegestaan een  postbus (postbox) en een poste restante.Bron: SGR 16.0
 */
data class NederlandsPostbusadres(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("soortAdres", required = true) override val soortAdres: SoortAdres,

    @field:Min(0)
    @field:Max(2147483647)
    @Schema(
        example = "null",
        required = true,
        description = "De numerieke aanduiding zoals deze door TNT Post is vastgesteld voor een Nederlandse POSTBUS.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - Postbusnummer"
    )
    @get:JsonProperty("postbusnummer", required = true) override val postbusnummer: Int,

    @field:Pattern(regexp = "^[1-9][0-9]{3} ?[a-zA-Z]{2}$")
    @Schema(
        example = "null",
        required = true,
        description = "De officiële codering van TNT Post voor een Nederlands postadres, bestaande uit een numeriek deel en een alfabetisch deel.Bron: SGR 16.0Norminstantie: NEN 5825:2002 - PostcodeOpmerking:-360 Het POSTCODE numerieke deel - bestaande uit vier cijfers - (formaat N4), is het deel van de POSTCODE dat een woonplaats, een wijk in een woonplaats, een groep postbussen in een woonplaats of een groep ANTWOORDNUMMERS in een woonplaats aangeeft. (Bron: STUCON)Het POSTCODE alfabetische deel - bestaande uit twee hoofdletters - (formaat A2), is het deel van de POSTCODE dat binnen een woonplaats of een wijk in een woonplaats, betrekking heeft op een groep van ongeveer 25 woningen, bedrijfspanden of iets dergelijks, op een aantal postbussen of op een aantal ANTWOORDNUMMERS. (Bron: UGR)Alle bestaanbare waardes voor POSTCODE zijn te vinden in de TNT postcodetabel. Deze is op te vragen bij de TNT Post.Bron: SGR 16.0"
    )
    @get:JsonProperty("postcode", required = true) override val postcode: String,

    @field:Pattern(regexp = "^[\\p{L}\\p{M}\\d\\-'\\.\\s]{1,40}$")
    @Schema(
        example = "null",
        required = true,
        description = "De naam van een door het bevoegde gemeentelijke orgaan als zodanig aangewezen gedeelte van het gemeentelijk grondgebied.Norminstantie: BAG/GBABron: SGR 16.0"
    )
    @get:JsonProperty("woonplaatsnaam", required = true) override val woonplaatsnaam: String,

    @field:Pattern(regexp = "^[\\p{L}\\p{M}\\d\\-'\\.\\s]{1,35}$")
    @Schema(
        example = "null",
        description = "Een nadere aanduiding bij de STRAATNAAM en - indien aanwezig - het HUISNUMMER of bij Postbus en POSTBUSNUMMER, dan wel Antwoordnummer en ANTWOORDNUMMER.Bron: SGR 16.0, gebaseerd op NEN 5825:2002 - LocatieomschrijvingOpmerkingen:Gebruikmaking van de LOCATIEOMSCHRIJVING kan om verschillende redenen wenselijk dan wel noodzakelijk zijn. Het HUISNUMMER kan ontbreken of men wil niet-uiterlijk waarneembare kenmerken, zoals toevoegingen voor nadere differentiatie achter de voordeur, vermelden.Voorbeelden van toevoegingen die in de LOCATIEOMSCHRIJVING opgenomen kunnen worden, zijn:poste restantewoonboot Mariannewoonwagen Bambiflat Orionkamer 412appartement V 113kelder, zolder, souterrain, enz.1e verdieping, 2e verdieping, enz.aanduiding ten behoeve van horizontale verdeling, zoals:linksmidden dwarsrechtsvoormidden evenwijdigachtervoor linksmidden linksachter linksvoor middenmidden middenachter midden2. De waarde poste restante voor een LOCATIEOMSCHRIJVING is niet toegestaan in een DOMICILIE-ADRES.3. De toelichting van LOCATIEBESCHRIJVING volgens BRP is een geheel of gedeeltelijke omschrijving van de ligging van een object. Als locatiebeschrijving is niet toegestaan een  postbus (postbox) en een poste restante.Bron: SGR 16.0"
    )
    @get:JsonProperty("locatieomschrijving") override val locatieomschrijving: String? = null
) : Adres

