package org.stekl0.lessons.lesson_2

import kotlin.math.pow

fun main() {
    val sum = 70000.0
    val rate = 16.7
    val years = 20
    val percent = 100
    val oneHundredPercent = 1

    val interestRate = oneHundredPercent + rate / percent
    val fullSum = sum * interestRate.pow(years)

    val result = "%.3f".format(fullSum)
    println(result)
}
