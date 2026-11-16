package com.example

fun add(left: Int, right: Int): Int = left + right

fun isPalindrome(value: String): Boolean {
    val cleaned = value.filter { it.isLetterOrDigit() }.lowercase()
    return cleaned == cleaned.reversed()
}
