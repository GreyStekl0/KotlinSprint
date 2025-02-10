package org.stekl0.lesson5

import java.util.Calendar

const val ADULT_AGE = 18

fun main() {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    println("Введите год рождения:")
    val birthYear = readln().toInt()

    val age = currentYear - birthYear

    if (age >= ADULT_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен.")
    }
}
