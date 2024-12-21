package org.example.lesson_5

fun main() {
    val login = "Zaphod"
    val password = "PanGalactic"

    println("Введите логин")
    val userLogin = readLine().toString()

    println("Введите пароль")
    val userPassword = readLine().toString()



    if (userLogin == login && userPassword == password) {
        println("Вы вошли в систему")

    } else {
        println("Пользователь не найден. Зарегистрируйтесь!")

        println("Введите логин")
        val newUserLogin = readLine().toString()

        println("Введите пароль")
        val newUserPassword = readLine().toString()
    }
}