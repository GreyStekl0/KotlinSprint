package org.stekl0.lessons.lesson_4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"

fun main() {
    val isWeatherToday = true
    val isTent = true
    val humidityToday = 20
    val currentSeason = "зима"

    val favorableConditions =
        isWeatherToday == IS_SUNNY &&
            isTent == IS_TENT_OPEN &&
            humidityToday == HUMIDITY &&
            currentSeason != UNFAVORABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}
