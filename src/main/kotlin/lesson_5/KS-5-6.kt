package org.example.lesson_5

fun main() {
    val weight = readln().toDouble()
    val heightIncentimeters = readln().toDouble()

    val heightInMeters = heightIncentimeters / 100
    val bodyMassIndex = weight / Math.pow((heightInMeters), 2.0)

    if (bodyMassIndex < 18.5) {
        println("Недостаточная масса тела. ИМТ - %.2f".format(bodyMassIndex))
    } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
        println("Нормальная масса тела. ИМТ - %.2f".format(bodyMassIndex))
    } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
        println("Избыточная масса тела. ИМТ - %.2f".format(bodyMassIndex))
    } else {
        println("Ожирение. ИМТ - %.2f".format(bodyMassIndex))
    }

}