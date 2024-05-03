package org.example.Lesson2

fun main() {
    val mike = 3
    val nik = 4
    val tod = 3
    val sergio = 5
    val numberOfStudents = 4
    val average = (((mike + nik + tod + sergio).toFloat()) / numberOfStudents)

    println(String.format("Средний балл: %.2f", average))

}