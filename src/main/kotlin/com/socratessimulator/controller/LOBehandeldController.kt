package com.socratessimulator.controller

import com.socratessimulator.api.LOBehandeldApi
import com.socratessimulator.model.ResponseLOBehandeld
import com.socratessimulator.model.ZaakLOBehandeld
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import jakarta.validation.Valid

@RestController
class LOBehandeldController : LOBehandeldApi {

    private val log = LoggerFactory.getLogger(LOBehandeldController::class.java)

    override fun apiVversionLOBehandeldPost(
        version: String,
        @Valid zaakLOBehandeld: ZaakLOBehandeld?
    ): ResponseEntity<ResponseLOBehandeld> {
        log.info("Received LOBehandeld request - version: $version")
        log.info("Payload: $zaakLOBehandeld")

        if (zaakLOBehandeld == null) {
            return ResponseEntity.badRequest().build()
        }

        val response = ResponseLOBehandeld(
            berichtId = zaakLOBehandeld.identificatie,
            responseId = java.util.UUID.randomUUID().toString(),
            timestamp = java.time.OffsetDateTime.now().toString()
        )

        return ResponseEntity.accepted().body(response)
    }
}
