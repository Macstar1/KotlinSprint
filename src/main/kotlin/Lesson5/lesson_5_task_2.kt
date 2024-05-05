package org.example.Lesson5

import java.util.*

fun main() {
    print("Введите год рождения: ")
    val yearOfBirth = readLine()!!.toInt()
    val myDate = Calendar.getInstance().get(Calendar.YEAR).toInt()

    val result = if (myDate - yearOfBirth >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран приложения"

    println(result)

}

const val AGE_OF_MAJORITY = 18

