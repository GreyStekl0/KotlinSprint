package org.stekl0.lesson_4

fun main() {
    val totalTables = 13
    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = bookedToday < totalTables
    val availableTomorrow = bookedTomorrow < totalTables

    println("Доступность столиков на сегодня: $availableToday")
    println("Доступность столиков на завтра: $availableTomorrow")
}