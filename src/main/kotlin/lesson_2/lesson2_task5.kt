package org.stekl0.lesson_2

import kotlin.math.pow

fun main() {
    val sum = 70000.0
    val rate = 16.7
    val years = 20

    val interestRate = 1 + rate/100
    val fullSum = sum * interestRate.pow(years)



    val result = "%.3f".format(fullSum)
    println(result)
}
