package org.example.lessons

fun main() {
    val seconds = 10000

    val minutes = seconds / 60
    val remainOfMinutes = seconds % 60

    val hours = minutes / 60
    val remainOfhours = minutes % 60

    val time = String.format("%02d:%02d:%02d", hours, remainOfhours, remainOfMinutes)
    println(time)

}