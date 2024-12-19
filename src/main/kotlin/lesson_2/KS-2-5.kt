package org.example.lesson_2

fun main() {
    val deposit = 70_000
    val percentOfRate = 0.167
    val years = 20

    val totalDeposit = deposit * Math.pow((1 + percentOfRate), years.toDouble())

    println("%.3f".format(totalDeposit))

}