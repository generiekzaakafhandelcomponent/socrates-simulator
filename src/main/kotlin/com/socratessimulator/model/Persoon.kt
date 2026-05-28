package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import com.socratessimulator.validation.ValidBsn
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

/**
 * 
 * @param burgerservicenummer Een uniek identificerend nummer van een PERSOON, die ingeschreven staat in de Gemeentelijke Basisadministratie Persoonsgegevens (GBA) of de Registratie Niet-ingezetenen (RNI).Bron: SGROpmerking:Elk nummer moet voldoen aan de bij de voorwaarden beschreven proef.Voorwaarden waarde BSN:  Indien het nummer per cijfer wordt aangeduid als (s0 s1 s2 s3 s4 s5 s6 s7 s8), dan is de volgende voorwaarde te controleren: (9 x s0) + (8 x s1) + (7 x s2) + (6 x s3) + (5 x s4) + (4 x s5) + (3 x s6) + (2 x s7) - (1 x s8) is deelbaar door 11Toelichting:  Het Burgerservicenummer onderscheidt zich van het Sofi-nummer voornamelijk voor wat betreft het bereik ervan en de wijze waarop wettelijk is vastgelegd wat met behulp van het Burgerservicenummer mag gebeuren.  De gebruikers van het Burgerservicenummer bestaan uit overheidsorganen alsmede niet-overheidsorganen. Omdat het niet duidelijk is wat de criteria zijn om niet-overheidsorganen wel of niet toe te laten tot het gebruik van het Burgerservicenummer is besloten om de gebruikersaspecten niet in de definitie op te nemen.De oorspronkelijke naamgeving en definitie van dit gegevenselement conform de (authentieke) bron:Elementnaam:    BurgerservicenummerDefinitie:    Elk ingeschreven persoon heeft een BSN, een nummer dat de persoon uniek identificeert in alle overheidsadministraties.Norminstantie:    GBA
 * @param geboortedatum De datum van geboorte van een PERSOON.Bron: NEN 1888:2002 - Geboortedatum (overgenomen zoals in SGR)Opmerking:Deze datum staat gewoonlijk vermeld op de geboorteakte dan wel een ander brondocument.Een GEBOORTEDATUM behoort te worden vastgesteld in verband met zijn rechtsgeldige betekenis, in het bijzonder voor de instellingen die minimaal een SZ-WET uitvoeren.
 * @param geslachtsaanduiding 
 * @param geslachtsnaamstam De stam van de geslachtsnaam. Deze is ontdaan van voorvoegsels en titels.
 * @param voorlettersAanschrijving De voorletters waarmee een persoon aangeschreven wil worden.
 * @param naamgebruik 
 * @param codeBrpGegevensGeheim 
 * @param nationaliteit Codes die de Nationaliteiten van een PERSOON aangeeft.
 * @param adreshouding 
 * @param aNummer Het administratienummer van een PERSOON binnen de gemeentelijke basisadministratie (GBA), zoals bedoeld als in artikel 50 van de Wet GBA.Norminstantie: GBA
 * @param bewindvoerder 
 * @param contactgegevens 
 * @param kinderen 
 * @param medebewoners 
 * @param partner 
 * @param profiel 
 * @param verblijfstitel 
 * @param huisvesting 
 * @param voornamen De samenvoeging van alle exemplaren van voornaam van een persoon.
 * @param voorvoegsel Voorvoegsel behorende bij de stam van de geslachtsnaam.
 * @param geslachtsnaamPartner 
 */
data class Persoon(

    @field:ValidBsn
    @Schema(example = "null", required = true, description = "Een uniek identificerend nummer van een PERSOON, die ingeschreven staat in de Gemeentelijke Basisadministratie Persoonsgegevens (GBA) of de Registratie Niet-ingezetenen (RNI).Bron: SGROpmerking:Elk nummer moet voldoen aan de bij de voorwaarden beschreven proef.Voorwaarden waarde BSN:  Indien het nummer per cijfer wordt aangeduid als (s0 s1 s2 s3 s4 s5 s6 s7 s8), dan is de volgende voorwaarde te controleren: (9 x s0) + (8 x s1) + (7 x s2) + (6 x s3) + (5 x s4) + (4 x s5) + (3 x s6) + (2 x s7) - (1 x s8) is deelbaar door 11Toelichting:  Het Burgerservicenummer onderscheidt zich van het Sofi-nummer voornamelijk voor wat betreft het bereik ervan en de wijze waarop wettelijk is vastgelegd wat met behulp van het Burgerservicenummer mag gebeuren.  De gebruikers van het Burgerservicenummer bestaan uit overheidsorganen alsmede niet-overheidsorganen. Omdat het niet duidelijk is wat de criteria zijn om niet-overheidsorganen wel of niet toe te laten tot het gebruik van het Burgerservicenummer is besloten om de gebruikersaspecten niet in de definitie op te nemen.De oorspronkelijke naamgeving en definitie van dit gegevenselement conform de (authentieke) bron:Elementnaam:    BurgerservicenummerDefinitie:    Elk ingeschreven persoon heeft een BSN, een nummer dat de persoon uniek identificeert in alle overheidsadministraties.Norminstantie:    GBA")
    @get:JsonProperty("burgerservicenummer", required = true) val burgerservicenummer: String,

    @field:Valid
    @Schema(example = "null", required = true, description = "De datum van geboorte van een PERSOON.Bron: NEN 1888:2002 - Geboortedatum (overgenomen zoals in SGR)Opmerking:Deze datum staat gewoonlijk vermeld op de geboorteakte dan wel een ander brondocument.Een GEBOORTEDATUM behoort te worden vastgesteld in verband met zijn rechtsgeldige betekenis, in het bijzonder voor de instellingen die minimaal een SZ-WET uitvoeren.")
    @get:JsonProperty("geboortedatum", required = true) val geboortedatum: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("geslachtsaanduiding", required = true) val geslachtsaanduiding: Geslachtsaanduiding,

    @get:Pattern(regexp="^[\\p{L}\\p{M}\\-'\\.,/\\s]{1,40}$")
    @Schema(example = "null", required = true, description = "De stam van de geslachtsnaam. Deze is ontdaan van voorvoegsels en titels.")
    @get:JsonProperty("geslachtsnaamstam", required = true) val geslachtsnaamstam: String,

    @get:Pattern(regexp="^[\\p{L}. ]*$")
    @Schema(example = "null", required = true, description = "De voorletters waarmee een persoon aangeschreven wil worden.")
    @get:JsonProperty("voorlettersAanschrijving", required = true) val voorlettersAanschrijving: String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("naamgebruik", required = true) val naamgebruik: Naamgebruik,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("codeBrpGegevensGeheim", required = true) val codeBrpGegevensGeheim: Geheim,

    @field:Valid
    @get:Size(min=1,max=2)
    @Schema(example = "null", required = true, description = "Codes die de Nationaliteiten van een PERSOON aangeeft.")
    @get:JsonProperty("nationaliteit", required = true) val nationaliteit: kotlin.collections.List<CodeNationaliteit>,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "")
    @get:JsonProperty("adreshouding") val adreshouding: kotlin.collections.List<Adreshouding>? = null,

    @get:Pattern(regexp="^[1-9][0-9]{9}$")
    @Schema(example = "null", description = "Het administratienummer van een PERSOON binnen de gemeentelijke basisadministratie (GBA), zoals bedoeld als in artikel 50 van de Wet GBA.Norminstantie: GBA")
    @get:JsonProperty("aNummer") val aNummer: String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("bewindvoerder") val bewindvoerder: Bewindvoerder? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contactgegevens") val contactgegevens: Contactgegevens? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("kinderen") val kinderen: kotlin.collections.List<OuderKind>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("medebewoners") val medebewoners: kotlin.collections.List<Medebewoner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("partner") val partner: Partner? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("profiel") val profiel: Profiel? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("verblijfstitel") val verblijfstitel: Verblijfstitel? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("huisvesting") val huisvesting: Huisvesting? = null,

    @get:Pattern(regexp="^[\\p{L}\\p{M}\\-'\\.,\\s]{1,200}$")
    @Schema(example = "null", description = "De samenvoeging van alle exemplaren van voornaam van een persoon.")
    @get:JsonProperty("voornamen") val voornamen: String? = null,

    @get:Pattern(regexp="^[\\p{L}\\p{M}\\-'\\.,\\s]{1,10}$")
    @Schema(example = "null", description = "Voorvoegsel behorende bij de stam van de geslachtsnaam.")
    @get:JsonProperty("voorvoegsel") val voorvoegsel: String? = null,

    @get:Pattern(regexp="^[\\p{L}\\p{M}\\-'\\.,\\s]{1,51}$")
    @Schema(example = "null", description = "")
    @get:JsonProperty("geslachtsnaamPartner") val geslachtsnaamPartner: String? = null
)

