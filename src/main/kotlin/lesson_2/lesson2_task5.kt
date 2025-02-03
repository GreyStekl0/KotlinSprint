package org.stekl0.lesson_2

fun main() {
    var sum = 70000.0
    val rate = 1.167
    val years = 20

    repeat(years) {
        sum = sum * rate
    }

    val result = "%.3f".format(sum)
    println(result)
}
