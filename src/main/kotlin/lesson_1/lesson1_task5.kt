package org.stekl0.lesson_1

fun main() {
    val conversion = 60

    var seconds = 6480
    var minutes = seconds / conversion
    seconds = seconds % conversion
    val hours = minutes / conversion
    minutes = minutes % conversion

    val result = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println(result)
}