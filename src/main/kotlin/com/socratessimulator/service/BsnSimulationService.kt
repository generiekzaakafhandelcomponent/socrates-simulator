package com.socratessimulator.service

import com.socratessimulator.model.ResponseLOBehandeld
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.time.OffsetDateTime
import java.util.UUID

@Service
class BsnSimulationService {

    fun resolve(bsn: String, berichtId: String): ResponseEntity<ResponseLOBehandeld> {
        val responseId = UUID.randomUUID().toString()
        val timestamp = OffsetDateTime.now().toString()

        val scenario = SCENARIOS[bsn]
        return if (scenario != null) {
            ResponseEntity.status(scenario.status).body(
                ResponseLOBehandeld(
                    berichtId = berichtId,
                    responseId = responseId,
                    timestamp = timestamp,
                    foutcode = scenario.foutcode,
                    foutomschrijving = scenario.foutomschrijving
                )
            )
        } else {
            ResponseEntity.ok().body(
                ResponseLOBehandeld(
                    berichtId = berichtId,
                    responseId = responseId,
                    timestamp = timestamp
                )
            )
        }
    }

    private data class Scenario(val status: HttpStatus, val foutcode: String, val foutomschrijving: String)

    private companion object {
        val SCENARIOS = mapOf(
            "999999400" to Scenario(HttpStatus.BAD_REQUEST,            "TEST_400", "Simulated 400 Bad Request"),
            "999999424" to Scenario(HttpStatus.UNPROCESSABLE_ENTITY,   "TEST_422", "Simulated Elfproef / BSN-error"),
            "999999503" to Scenario(HttpStatus.INTERNAL_SERVER_ERROR,  "TEST_500", "Simulated 500 Internal Server Error")
        )
    }
}