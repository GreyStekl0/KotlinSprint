package lessons.lesson5

fun main() {
    val hundredKm = 100

    println("Введите расстояние поездки (в километрах):")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption = readln().toDouble()

    println("Введите текущую цену за литр топлива:")
    val fuelPrice = readln().toDouble()

    val fuelNeeded = (distance * fuelConsumption) / hundredKm
    val totalCost = fuelNeeded * fuelPrice

    println("Общее количество необходимого топлива: %.2f литров".format(fuelNeeded))
    println("Итоговая стоимость поездки: %.2f рублей".format(totalCost))
}
