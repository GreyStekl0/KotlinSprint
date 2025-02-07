package org.stekl0.lesson_4

const val isSunny = true
const val isTentOpen = true
const val humidity = 20
const val unfavorableSeason = "зима"

fun main() {
    val weatherToday = true
    val tent = true
    val humidityToday = 20
    val currentSeeson = "зима"


    val favorableConditions =
        weatherToday == isSunny && tent == isTentOpen && humidityToday == humidity && currentSeeson != unfavorableSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}