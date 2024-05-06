package org.example.Lesson5

fun main() {
    val firstWinNumber = 14
    val secondWinNumber = 9

    print("Введите первое число: ")
    val firstNumber = readLine()!!.toInt()
    print("Введите второе число: ")
    val secondNumber = readLine()!!.toInt()

    if ((firstNumber == firstWinNumber && secondNumber == secondWinNumber) || (firstNumber == secondWinNumber &&
                secondNumber == firstWinNumber))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstNumber == firstWinNumber || secondNumber == secondWinNumber) || (firstNumber == secondWinNumber ||
                secondNumber == firstWinNumber))
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

}

