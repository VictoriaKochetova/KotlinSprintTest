package org.example.Lesson_4

fun main() {

    val totalTables = 13
    val reservedToday = 13
    val reservedTomorrow = 9

    val availabilityToday = reservedToday < totalTables
    val availabilityTomorrow = reservedTomorrow < totalTables

    println("Доступность столиков на сегодня: $availabilityToday")
    println("Доступность столиков на завтра: $availabilityTomorrow")
}