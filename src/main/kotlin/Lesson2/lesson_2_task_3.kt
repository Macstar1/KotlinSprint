package org.example.Lesson2

fun main(){
    val startHour = 9
    val startMinute = 39
    val routeTime = 457

    val finishTime = startHour * PART_OF_TIME + startMinute + routeTime // Время прибытия в минутах
    val finishHour = finishTime / PART_OF_TIME //Прибытие часы
    val finishMinute = finishTime % PART_OF_TIME //Прибытие минуты

    println("Время прибытия: $finishHour:$finishMinute")

}
const val PART_OF_TIME = 60