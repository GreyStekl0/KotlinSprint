package org.stekl0.lesson5

fun main() {
    val cmToM = 100
    val insufficientBmi = 18.5
    val normalBmi = 25
    val excessiveBmi = 30

    println("Введите ваш вес (в килограммах):")
    val weight = readln().toDouble()

    println("Введите ваш рост (в сантиметрах):")
    val heightCm = readln().toDouble()

    val heightM = heightCm / cmToM
    val bmi = weight / (heightM * heightM)

    val category =
        when {
            bmi < insufficientBmi -> "Недостаточная масса тела"
            bmi < normalBmi -> "Нормальная масса тела"
            bmi < excessiveBmi -> "Избыточная масса тела"
            else -> "Ожирение"
        }

    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория веса: $category")
}
