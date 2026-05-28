package com.socratessimulator.validation

import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class BsnValidator : ConstraintValidator<ValidBsn, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext): Boolean {
        if (value == null) return true
        if (!value.matches(Regex("^[0-9]{9}$"))) return false

        val weights = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, -1)
        val sum = value.mapIndexed { i, c -> c.digitToInt() * weights[i] }.sum()
        return sum != 0 && sum % 11 == 0
    }
}
