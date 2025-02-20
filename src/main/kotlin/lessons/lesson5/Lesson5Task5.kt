package lessons.lesson5

import kotlin.random.Random

fun main() {
    val numberCount = 3
    val maxNumber = 42
    val minNumber = 0

    val winningNumbers = List(numberCount) { Random.nextInt(minNumber, maxNumber + 1) }

    println("Введите три числа (от 0 до 42):")
    val userNumbers =
        List(numberCount) {
            print("Число ${it + 1}: ")
            readln().toInt()
        }

    val matches = winningNumbers.intersect(userNumbers).size

    when (matches) {
        numberCount -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")
}
