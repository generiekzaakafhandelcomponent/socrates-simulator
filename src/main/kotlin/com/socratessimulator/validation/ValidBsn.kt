package com.socratessimulator.validation

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [BsnValidator::class])
annotation class ValidBsn(
    val message: String = "must be a valid BSN (9 digits, passes elfproef)",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
