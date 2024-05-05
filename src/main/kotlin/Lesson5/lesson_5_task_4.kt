package org.example.Lesson5

fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    println("Что ж, введи, пожалуйста, свое имя пользователя: ")
    val name = readln()
    if (name == userName) {
        println("Введите пароль: ")
        val password = readln()
        if (password == userPassword) println("Ваши данные проверены, и, о чудо, они верны...")
    }
    else println("Вы не зарегистрированы. [вздыхает...] Пройдите, пожалуйста, регистрацию.")

}