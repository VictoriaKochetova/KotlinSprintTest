package org.example.lesson_2

fun main() {
    val deposit = 70_000
    val percentOfRate = 16.7
    val rateInFractions = percentOfRate / 100

    val years = 20

    val totalDeposit = deposit * Math.pow((1 + (rateInFractions)), years.toDouble())

    println("%.3f".format(totalDeposit))

}