package org.stekl0.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 1.2

    val fullCrystal = crystalOre * buff
    val fullIron = ironOre * buff

    val buffCrystal = (fullCrystal - crystalOre).toInt()
    val buffIron = (fullIron - ironOre).toInt()

    println("благодаря баффу было получено дополнительно $buffCrystal кристаллов")
    println("благодаря баффу было получено дополнительно $buffIron железа")
}