package org.example.lesson_2

const val MINUTESINHOUR = 60

fun main() {
    val hours = 9
    val minutes = 39
    val mintutesOfTravel = 457

    val totalMinutes = hours * MINUTESINHOUR + minutes + mintutesOfTravel

    val arrivalhours = totalMinutes / MINUTESINHOUR
    val arrivalminutes = totalMinutes % MINUTESINHOUR

    println("$arrivalhours:$arrivalminutes")


}
