package org.example.Lesson5

fun main() {

    var randomValues = mutableListOf(
        (1..THE_ULTIMATE_QUESTION).random(),
        (1..THE_ULTIMATE_QUESTION).random(),
        (1..THE_ULTIMATE_QUESTION).random()
    )

    while (randomValues.distinct().size < 3) {
        randomValues = mutableListOf(
            (1..THE_ULTIMATE_QUESTION).random(),
            (1..THE_ULTIMATE_QUESTION).random(),
            (1..THE_ULTIMATE_QUESTION).random()
        )
    }

    // Для проверки работоспособности программы
    // println(randomValues)

    println("Введите три числа от 1 до $THE_ULTIMATE_QUESTION: ")

    val userValues = listOf(readln().toInt(), readln().toInt(), readln().toInt())
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

const val THE_ULTIMATE_QUESTION = 42