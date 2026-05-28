package com.socratessimulator.controller

import com.socratessimulator.api.LOBehandeldApi
import com.socratessimulator.model.ResponseLOBehandeld
import com.socratessimulator.model.ZaakLOBehandeld
import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import java.util.UUID

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
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build()
        }

        val response = ResponseLOBehandeld(
            berichtId = zaakLOBehandeld.identificatie,
            responseId = UUID.randomUUID().toString(),
            timestamp = OffsetDateTime.now().toString()
        )

        return ResponseEntity.accepted().body(response)
    }
}
