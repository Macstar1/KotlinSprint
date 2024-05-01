package org.example.Lesson1

fun main(){
    val firstFlyYear = 1961
    var firstFlyHour = "09"
    var firstFlyMinute = "07"

    println("$firstFlyYear\n$firstFlyHour\n$firstFlyMinute")

    firstFlyHour = "10"
    firstFlyMinute = "55"
    println("$firstFlyHour:$firstFlyMinute")

    //В принципе, можно и так, судя по подсказке:
    //print(firstFlyHour)
    //print(":")
    //print(firstFlyMinute)

}