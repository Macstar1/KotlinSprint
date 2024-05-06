package org.example.Lesson5

import kotlin.random.Random

fun main() {
    val randomValues = listOf(Random.nextInt(0, 42), Random.nextInt(0, 42), Random.nextInt(0, 42))
    // Для проверки работоспособности программы
    // println(randomValues)
    val userValues = mutableListOf(readln().toInt(), readln().toInt(), readln().toInt())
    val intersectList = userValues.intersect(randomValues.toList())
    val numberOfIntersection = intersectList.size
    val result = when (numberOfIntersection) {
        0 -> "Вы не угадали ни одного числа"
        1 -> "Получите утешительный приз."
        2 -> "Вы угадали два числа! Получите крупный приз!"
        3 -> "Вы угадали все числа!! Вы выиграли ДЖЕКПОТ!!"
        else -> "Пум, пум , пум... Что-то пошло не так"
    }
    println(result)
}