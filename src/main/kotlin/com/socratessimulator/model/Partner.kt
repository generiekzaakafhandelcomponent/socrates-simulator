package com.socratessimulator.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.AssertTrue

/**
 *
 * @param partnerRelatietype
 * @param ingangsdatumRelatie Verplicht wanneer partnerRelatietype 4 (Overigefamilierelatie) is.
 */
data class Partner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PartnerRelatietype", required = true) val partnerRelatietype: PartnerRelatietype,

    @Schema(example = "null", description = "Verplicht wanneer PartnerRelatietype 4 (Overigefamilierelatie) is.")
    @get:JsonProperty("IngangsdatumRelatie") val ingangsdatumRelatie: java.time.LocalDate? = null
) {
    @get:JsonIgnore
    @get:AssertTrue(message = "IngangsdatumRelatie is verplicht wanneer PartnerRelatietype 4 is")
    val isIngangsdatumRelatieAanwezigIndienVerplicht: Boolean
        get() = partnerRelatietype != PartnerRelatietype._4 || ingangsdatumRelatie != null
}
