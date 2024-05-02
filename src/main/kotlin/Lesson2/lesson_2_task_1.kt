package org.example.Lesson2

fun main(){
    //Инициализируем переменные
    val mike = 3
    val nik = 4
    val tod = 3
    val sergio = 5
    val numberOfStudents = 4
    val average : Float

    //Вычисляем среднее
    average = (((mike + nik + tod + sergio).toFloat())/numberOfStudents)

    //Печатаем результат с обязательным выведением двух знаков после запятой
    println(String.format("Средний балл: %.2f",average))

}