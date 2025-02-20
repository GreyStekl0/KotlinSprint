package org.stekl0.lessons.lesson_2

fun main() {
    var hour = 9
    var minute = 39
    var timeToTravel = 457
    val conversion = 60

    timeToTravel += hour * conversion + minute
    hour = timeToTravel / conversion
    minute = timeToTravel % conversion

    val arrivalTime = String.format("%02d:%02d", hour, minute)
    println(arrivalTime)
}
