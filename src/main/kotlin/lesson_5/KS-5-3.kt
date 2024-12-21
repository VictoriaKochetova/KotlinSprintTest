package org.example.lesson_5

fun main() {
    val winningNumber1 = 13
    val winningNumber2 = 36

    println("Введите первое число от 0 до 42:")
    val userNumber1 = readLine()?.toIntOrNull()

    println("Введите второе число от 0 до 42:")
    val userNumber2 = readLine()?.toIntOrNull()

    if ((userNumber1 == winningNumber1 && userNumber2 == winningNumber2)||(userNumber1 == winningNumber2 && userNumber2 == winningNumber1)) {
        println("“Поздравляем! Вы выиграли главный приз!")

    } else if (userNumber1 == winningNumber1 || userNumber2 == winningNumber2 || userNumber1 == winningNumber2 || userNumber2 == winningNumber1) {
        println("Вы выиграли утешительный приз!")
        println("Числа для победы: $winningNumber1 и $winningNumber2")

    } else {
        println("Неудача!")
        println("Числа для победы: $winningNumber1 и $winningNumber2")
    }

}
