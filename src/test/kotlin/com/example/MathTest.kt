package com.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class MathTest {
    @Test
    fun addsTwoNumbers() {
        assertEquals(5, add(2, 3))
    }

    @Test
    fun racecarIsPalindrome() {
        assertEquals(true, isPalindrome("Racecar"))
    }

    @Test
    fun helloIsNotPalindrome() {
        assertFalse(isPalindrome("hello"))
    }

    @Test
    fun panamaIsPalindrome() {
        assertEquals(true, isPalindrome("A man, a plan, a canal: Panama"))
    }
}
