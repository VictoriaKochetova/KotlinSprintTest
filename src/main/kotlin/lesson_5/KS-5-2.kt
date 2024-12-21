package org.example.lesson_5

fun main() {
    println("Введите ваш год рождения:")
    val userBirthYear = readln().toInt()
    val currentYear = 2024
    val userAge = currentYear - userBirthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }

}

const val AGE_OF_MAJORITY = 18