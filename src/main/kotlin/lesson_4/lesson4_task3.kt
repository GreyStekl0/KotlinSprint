package org.stekl0.lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "зима"

    val favorableConditions = isSunny && isTentOpen && humidity == 20 && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}