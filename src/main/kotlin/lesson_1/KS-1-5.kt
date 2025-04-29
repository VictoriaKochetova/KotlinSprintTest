package org.example.lesson_1

const val SECONDSINMINUTE = 60

fun main() {
    val seconds = 10000

    val minutes = seconds / SECONDSINMINUTE
    val remainOfMinutes = seconds % SECONDSINMINUTE

    val hours = minutes / SECONDSINMINUTE
    val remainOfhours = minutes % SECONDSINMINUTE

    val time = String.format("%02d:%02d:%02d", hours, remainOfhours, remainOfMinutes)
    println(time)
}