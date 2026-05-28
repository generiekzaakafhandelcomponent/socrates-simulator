package com.socratessimulator.validation

import jakarta.validation.ConstraintValidatorContext
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class BsnValidatorTest {

    private val validator = BsnValidator()
    private val context = mock(ConstraintValidatorContext::class.java)

    @Test
    fun `valid BSN passes elfproef`() {
        assertTrue(validator.isValid("123456782", context))
    }

    @Test
    fun `correct format but wrong checksum is rejected`() {
        assertFalse(validator.isValid("123456789", context))
    }

    @Test
    fun `too short is rejected`() {
        assertFalse(validator.isValid("12345678", context))
    }

    @Test
    fun `non-digits are rejected`() {
        assertFalse(validator.isValid("12345678A", context))
    }

    @Test
    fun `all zeros is rejected`() {
        assertFalse(validator.isValid("000000000", context))
    }
}
