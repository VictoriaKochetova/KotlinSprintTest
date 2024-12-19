package org.example.lesson_2

fun main() {

    val countOfEmployees = 50
    val employeesSalary = 30000
    val countOfIntern = 30
    val internSalary = 20000

    val totalEmployeesSalary = countOfEmployees * employeesSalary
    val totalSalary = totalEmployeesSalary + (countOfIntern * internSalary)
    val averageSalary = totalSalary/(countOfEmployees + countOfIntern)

    println(totalEmployeesSalary)
    println(totalSalary)
    println(averageSalary)
}

