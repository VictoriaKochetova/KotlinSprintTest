package org.example.Lesson_4

fun main() {
    val trainingDay = 5

    val isArmsAndAbsDay = trainingDay % 2 != 0
    val isLegsAndBackDay = !isArmsAndAbsDay

    println(
        """
        Упражнения для рук: $isArmsAndAbsDay
        Упражнения для ног: $isLegsAndBackDay
        Упражнения для спины: $isLegsAndBackDay
        Упражнения для пресса: $isArmsAndAbsDay
    """.trimIndent()
    )
}