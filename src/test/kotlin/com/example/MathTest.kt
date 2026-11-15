package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class MathTest {
    @Test
    fun addsTwoNumbers() {
        assertEquals(5, add(2, 3))
    }
}
