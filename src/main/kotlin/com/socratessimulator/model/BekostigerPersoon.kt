package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern

/**
 * 
 * @param soortBekostiger
 * @param burgerservicenummer Een uniek identificerend nummer van een PERSOON, die ingeschreven staat in de Gemeentelijke Basisadministratie Persoonsgegevens (GBA) of de Registratie Niet-ingezetenen (RNI).Bron: SGROpmerking:Elk nummer moet voldoen aan de bij de voorwaarden beschreven proef.Voorwaarden waarde BSN:  Indien het nummer per cijfer wordt aangeduid als (s0 s1 s2 s3 s4 s5 s6 s7 s8), dan is de volgende voorwaarde te controleren: (9 x s0) + (8 x s1) + (7 x s2) + (6 x s3) + (5 x s4) + (4 x s5) + (3 x s6) + (2 x s7) - (1 x s8) is deelbaar door 11Toelichting:  Het Burgerservicenummer onderscheidt zich van het Sofi-nummer voornamelijk voor wat betreft het bereik ervan en de wijze waarop wettelijk is vastgelegd wat met behulp van het Burgerservicenummer mag gebeuren.  De gebruikers van het Burgerservicenummer bestaan uit overheidsorganen alsmede niet-overheidsorganen. Omdat het niet duidelijk is wat de criteria zijn om niet-overheidsorganen wel of niet toe te laten tot het gebruik van het Burgerservicenummer is besloten om de gebruikersaspecten niet in de definitie op te nemen.De oorspronkelijke naamgeving en definitie van dit gegevenselement conform de (authentieke) bron:Elementnaam:    BurgerservicenummerDefinitie:    Elk ingeschreven persoon heeft een BSN, een nummer dat de persoon uniek identificeert in alle overheidsadministraties.Norminstantie:    GBA
 * @param geboortedatum De datum van geboorte van een PERSOON.Bron: NEN 1888:2002 - Geboortedatum (overgenomen zoals in SGR)Opmerking:Deze datum staat gewoonlijk vermeld op de geboorteakte dan wel een ander brondocument.Een GEBOORTEDATUM behoort te worden vastgesteld in verband met zijn rechtsgeldige betekenis, in het bijzonder voor de instellingen die minimaal een SZ-WET uitvoeren.
 * @param naam De feitelijke naam van de persoon.
 */
data class BekostigerPersoon(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("soortBekostiger", required = true) val soortBekostiger: SoortBekostiger,

    @get:Pattern(regexp = "^[0-9]{9}$")
    @Schema(
        example = "null",
        required = true,
        description = "Een uniek identificerend nummer van een PERSOON, die ingeschreven staat in de Gemeentelijke Basisadministratie Persoonsgegevens (GBA) of de Registratie Niet-ingezetenen (RNI).Bron: SGROpmerking:Elk nummer moet voldoen aan de bij de voorwaarden beschreven proef.Voorwaarden waarde BSN:  Indien het nummer per cijfer wordt aangeduid als (s0 s1 s2 s3 s4 s5 s6 s7 s8), dan is de volgende voorwaarde te controleren: (9 x s0) + (8 x s1) + (7 x s2) + (6 x s3) + (5 x s4) + (4 x s5) + (3 x s6) + (2 x s7) - (1 x s8) is deelbaar door 11Toelichting:  Het Burgerservicenummer onderscheidt zich van het Sofi-nummer voornamelijk voor wat betreft het bereik ervan en de wijze waarop wettelijk is vastgelegd wat met behulp van het Burgerservicenummer mag gebeuren.  De gebruikers van het Burgerservicenummer bestaan uit overheidsorganen alsmede niet-overheidsorganen. Omdat het niet duidelijk is wat de criteria zijn om niet-overheidsorganen wel of niet toe te laten tot het gebruik van het Burgerservicenummer is besloten om de gebruikersaspecten niet in de definitie op te nemen.De oorspronkelijke naamgeving en definitie van dit gegevenselement conform de (authentieke) bron:Elementnaam:    BurgerservicenummerDefinitie:    Elk ingeschreven persoon heeft een BSN, een nummer dat de persoon uniek identificeert in alle overheidsadministraties.Norminstantie:    GBA"
    )
    @get:JsonProperty("burgerservicenummer", required = true) val burgerservicenummer: String,

    @field:Valid
    @Schema(
        example = "null",
        required = true,
        description = "De datum van geboorte van een PERSOON.Bron: NEN 1888:2002 - Geboortedatum (overgenomen zoals in SGR)Opmerking:Deze datum staat gewoonlijk vermeld op de geboorteakte dan wel een ander brondocument.Een GEBOORTEDATUM behoort te worden vastgesteld in verband met zijn rechtsgeldige betekenis, in het bijzonder voor de instellingen die minimaal een SZ-WET uitvoeren."
    )
    @get:JsonProperty("geboortedatum", required = true) val geboortedatum: java.time.LocalDate,

    @get:Pattern(regexp = "^[\\p{L}\\p{M}\\-'\\.,\\s]{1, 40}$")
    @Schema(example = "null", required = true, description = "De feitelijke naam van de persoon.")
    @get:JsonProperty("naam", required = true) val naam: String
)

