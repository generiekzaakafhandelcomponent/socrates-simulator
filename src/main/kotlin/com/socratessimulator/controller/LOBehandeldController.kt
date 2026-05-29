package com.socratessimulator.controller

import com.socratessimulator.api.LOBehandeldApi
import com.socratessimulator.model.ResponseLOBehandeld
import com.socratessimulator.model.ZaakLOBehandeld
import com.socratessimulator.service.BsnSimulationService
import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class LOBehandeldController(
    private val bsnSimulationService: BsnSimulationService
) : LOBehandeldApi {

    private val log = LoggerFactory.getLogger(LOBehandeldController::class.java)

    override fun apiVversionLOBehandeldPost(
        version: String,
        @Valid zaakLOBehandeld: ZaakLOBehandeld?
    ): ResponseEntity<ResponseLOBehandeld> {
        log.info("Received LOBehandeld request - version: $version")

        if (zaakLOBehandeld == null) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build()
        }

        val bsn = zaakLOBehandeld.loBehandeld.huishouding.aanvrager.burgerservicenummer
        return bsnSimulationService.resolve(bsn, zaakLOBehandeld.identificatie)
    }
}
