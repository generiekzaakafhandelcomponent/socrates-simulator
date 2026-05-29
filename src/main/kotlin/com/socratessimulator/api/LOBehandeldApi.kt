package com.socratessimulator.api

import com.socratessimulator.model.ResponseLOBehandeld
import com.socratessimulator.model.ZaakLOBehandeld
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@Validated
@RequestMapping("\${api.base-path:}")
interface LOBehandeldApi {

    @Operation(
        tags = ["LOBehandeld"],
        summary = "",
        operationId = "apiVversionLOBehandeldPost",
        description = """""",
        responses = [
            ApiResponse(
                responseCode = "202",
                description = "Accepted",
                content = [Content(schema = Schema(implementation = ResponseLOBehandeld::class))]
            ),
            ApiResponse(
                responseCode = "422",
                description = "Unprocessable Content",
                content = [Content(schema = Schema(implementation = ResponseLOBehandeld::class))]
            ),
            ApiResponse(
                responseCode = "500",
                description = "Internal Server Error",
                content = [Content(schema = Schema(implementation = ResponseLOBehandeld::class))]
            )
        ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/api/v{version}/lobehandeld"],
        produces = ["application/json"],
        consumes = ["application/json-patch+json", "application/json", "text/json", "application/*+json"]
    )
    fun apiVversionLOBehandeldPost(
        @Parameter(
            description = "",
            required = true
        ) @PathVariable("version") version: String,
        @Parameter(description = "") @Valid @RequestBody(required = false) zaakLOBehandeld: ZaakLOBehandeld?
    ): ResponseEntity<ResponseLOBehandeld> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
