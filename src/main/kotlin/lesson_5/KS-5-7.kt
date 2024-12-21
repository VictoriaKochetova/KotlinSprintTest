package org.example.lesson_5

fun main() {
    val distance = readln().toDouble()
    val fuelConsumption = readln().toDouble()
    val costPerLiter = readln().toDouble()

    val totalFuelConsumption = (distance * fuelConsumption) / 100
    val totalCost = totalFuelConsumption * costPerLiter

    println("Общее количество необходимого топлива: %.2f".format(totalFuelConsumption))
    println("Итоговая стоимость поездки: %.2f".format(totalCost))
}