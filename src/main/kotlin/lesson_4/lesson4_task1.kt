package org.stekl0.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    val isAvailableToday = bookedToday < TOTAL_TABLES
    val isAvailableTomorrow = bookedTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня: $isAvailableToday")
    println("Доступность столиков на завтра: $isAvailableTomorrow")
}