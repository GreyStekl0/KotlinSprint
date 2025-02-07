package org.stekl0.lesson_4

fun main() {
    val day = 5

    val isArmAndAbsDay = day % 2 != 0
    val isLegAndBackDay = !isArmAndAbsDay

    println("Упражнения для рук:    $isArmAndAbsDay")
    println("Упражнения для ног:   $isLegAndBackDay")
    println("Упражнения для спины: $isLegAndBackDay")
    println("Упражнения для пресса: $isArmAndAbsDay")
}