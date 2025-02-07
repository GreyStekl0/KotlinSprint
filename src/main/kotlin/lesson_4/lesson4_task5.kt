package org.stekl0.lesson_4

const val maxStaff = 70
const val minStaff = 55
const val minBoxes = 50

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

    val canSetSail = (!hasDamage && crewCount in minStaff..maxStaff && provisionBoxes > minBoxes) ||
            (hasDamage && crewCount == maxStaff && isWeatherFavorable && provisionBoxes >= minBoxes)

    println("Может ли корабль отправиться в плавание? $canSetSail")
}