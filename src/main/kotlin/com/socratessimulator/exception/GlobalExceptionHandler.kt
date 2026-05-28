package com.socratessimulator.exception

import com.socratessimulator.model.ResponseLOBehandeld
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.validation.FieldError
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.time.OffsetDateTime
import java.util.*

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationExceptions(ex: MethodArgumentNotValidException): ResponseEntity<ResponseLOBehandeld> {
        val errors = ex.bindingResult.allErrors.map { error ->
            if (error is FieldError) {
                "${error.field}: ${error.defaultMessage}"
            } else {
                "${error.objectName}: ${error.defaultMessage}"
            }
        }

        val response = ResponseLOBehandeld(
            berichtId = null,
            responseId = UUID.randomUUID().toString(),
            timestamp = OffsetDateTime.now().toString(),
            foutcode = "VALIDATION_ERROR",
            foutomschrijving = "Validation failed for the request body",
            fouten = errors
        )

        return ResponseEntity.unprocessableEntity().body(response)
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleHttpMessageNotReadableException(ex: HttpMessageNotReadableException): ResponseEntity<ResponseLOBehandeld> {
        val response = ResponseLOBehandeld(
            berichtId = null,
            responseId = UUID.randomUUID().toString(),
            timestamp = OffsetDateTime.now().toString(),
            foutcode = "MALFORMED_JSON",
            foutomschrijving = "Malformed JSON request or missing required fields",
            details = ex.mostSpecificCause.message
        )

        return ResponseEntity.unprocessableEntity().body(response)
    }

    @ExceptionHandler(Exception::class)
    fun handleUnexpectedException(ex: Exception): ResponseEntity<ResponseLOBehandeld> {
        val response = ResponseLOBehandeld(
            berichtId = null,
            responseId = UUID.randomUUID().toString(),
            timestamp = OffsetDateTime.now().toString(),
            foutcode = "INTERNAL_SERVER_ERROR",
            foutomschrijving = "An unexpected error occurred",
            details = ex.message
        )

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response)
    }
}
