package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.20

    val buffOfCrystalOre = (crystalOre * buff).toInt()
    val buffOfIronOre = (ironOre * buff).toInt()

    println("Кристаллическая руда: $buffOfCrystalOre")
    println("Железная руда: $buffOfIronOre")

}