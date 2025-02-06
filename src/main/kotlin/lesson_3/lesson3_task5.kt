package org.stekl0.lesson_3

fun main() {
    val moveString = "D2-D4;0"

    val parts = moveString.split(";", "-")
    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2]

    println("From: $from")
    println("To: $to")
    println("Move Number: $moveNumber")
}