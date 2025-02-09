package org.stekl0.lesson5

import kotlin.random.Random

fun main() {
    val minNumber = 0
    val maxNumber = 42

    val winningNumber1 = Random.nextInt(minNumber, maxNumber)
    val winningNumber2 = Random.nextInt(minNumber, maxNumber)

    println("Введите первое число (от 0 до 42):")
    val userNumber1 = readln().toInt()

    println("Введите второе число (от 0 до 42):")
    val userNumber2 = readln().toInt()

    val isFirstNumberCorrect = (userNumber1 == winningNumber1 || userNumber1 == winningNumber2)
    val isSecondNumberCorrect = (userNumber2 == winningNumber1 || userNumber2 == winningNumber2)

    when {
        isFirstNumberCorrect && isSecondNumberCorrect -> println("Поздравляем! Вы выиграли главный приз!")
        isFirstNumberCorrect || isSecondNumberCorrect -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Выигрышные числа были: $winningNumber1 и $winningNumber2")
}
