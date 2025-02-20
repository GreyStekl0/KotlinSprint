package org.stekl0.lessons.lesson_4

const val MAX_STAFF = 70
const val MIN_STAFF = 55
const val MIN_BOXES = 50

fun main() {
    println("Введите наличие повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean()
    println(hasDamage)

    println("Введите текущий состав экипажа:")
    val crewCount = readln().toInt()

    println("Введите количество ящиков с провизией на борту:")
    val provisionBoxes = readln().toInt()

    println("Введите благоприятность метеоусловий (true/false):")
    val isWeatherFavorable = readln().toBoolean()

    val canSetSail =
        (!hasDamage && crewCount in MIN_STAFF..MAX_STAFF && provisionBoxes > MIN_BOXES) ||
            (hasDamage && crewCount == MAX_STAFF && isWeatherFavorable && provisionBoxes >= MIN_BOXES)

    println("Может ли корабль отправиться в плавание? $canSetSail")
}
