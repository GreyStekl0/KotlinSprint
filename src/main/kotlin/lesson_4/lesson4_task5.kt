package org.stekl0.lesson_4

fun main() {
    println("Введите наличие повреждений корпуса (true/false):")
    val hasDamage = readLine().toBoolean()
    println(hasDamage)

    println("Введите текущий состав экипажа:")
    val crewCount = readLine()!!.toInt()

    println("Введите количество ящиков с провизией на борту:")
    val provisionBoxes = readLine()!!.toInt()

    println("Введите благоприятность метеоусловий (true/false):")
    val isWeatherFavorable = readLine().toBoolean()

    val canSetSail = (!hasDamage && crewCount in 55..70 && provisionBoxes > 50) ||
            (hasDamage && crewCount == 70 && isWeatherFavorable && provisionBoxes >= 50)

    println("Может ли корабль отправиться в плавание? $canSetSail")
}