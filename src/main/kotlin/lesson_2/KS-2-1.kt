package org.example.lesson_2

fun main() {
    val student_1 = 3
    val student_2 = 4
    val student_3 = 3
    val student_4 = 5
    val countOfStudents = 4

    val sum = (student_1 + student_2 + student_3 + student_4).toFloat()
    val averageScore = sum / countOfStudents

    println(String.format("%.2f", averageScore))
}