package org.stekl0.lesson5

import kotlin.random.Random

fun main() {
    val number1 = Random.nextInt(1, 10)
    val number2 = Random.nextInt(1, 10)
    val correctAnswer = number1 + number2

    println("Для входа в приложение, докажите, что вы не бот.")
    println("Решите следующий пример: $number1 + $number2 = ?")

    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
