package org.example.lesson_5

fun main() {
    val number1 = 2
    val number2 = 3
    val sum = number1 + number2

    val userAmswer = readln().toInt()

    val textEnterMessage = if (userAmswer == sum) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен."
    }
    println(textEnterMessage)
}