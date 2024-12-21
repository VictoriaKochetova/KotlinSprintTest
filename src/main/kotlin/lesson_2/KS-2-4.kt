package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val buffOfCrystalOre = (crystalOre * buff / 100).toInt()
    val buffOfIronOre = (ironOre * buff / 100).toInt()

    println("Кристаллическая руда: $buffOfCrystalOre")
    println("Железная руда: $buffOfIronOre")

}