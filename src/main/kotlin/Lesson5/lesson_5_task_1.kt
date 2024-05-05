package org.example.Lesson5

fun main() {
    val firstTerm = 14
    val secondTerm = 28

    print("Чему равна сумма $firstTerm и $secondTerm? ")
    val result = if (readLine()!!.toInt() == (firstTerm + secondTerm)) "Добро пожаловать!"
    else "Доступ запрещен."

    println(result)

}