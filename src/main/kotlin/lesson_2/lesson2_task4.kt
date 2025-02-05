package org.stekl0.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val percent = 100f
    val oneHundredPercent = 1

    val allPrey = oneHundredPercent + buff / percent
    val fullCrystal = crystalOre * allPrey
    val fullIron = ironOre * allPrey

    val buffCrystal = (fullCrystal - crystalOre).toInt()
    val buffIron = (fullIron - ironOre).toInt()

    println("благодаря баффу было получено дополнительно $buffCrystal кристаллов")
    println("благодаря баффу было получено дополнительно $buffIron железа")
}