package org.example.Lesson3

fun main() {
    var surname = "Андреева"
    val name = "Татьяна"
    val patron = "Сергеевна"
    var age = 20

    println("$surname $name $patron, возраст:$age")

    age = 22
    surname = "Сидорова"

    println("$surname $name $patron, возраст:$age")

}