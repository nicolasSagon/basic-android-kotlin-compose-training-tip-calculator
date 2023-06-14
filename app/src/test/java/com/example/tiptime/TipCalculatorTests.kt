package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.0
        val percentage = 20.0
        val actualTip = calculateTip(amount, percentage, false)
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)

        assertEquals(expectedTip, actualTip)
    }
}