package org.example.Lesson4

fun main() {
    val weatherIsSunsine = true
    val tentIsOpen = true
    val airHumidity = 20
    val season = "зима"
    val goodConditions = weatherIsSunsine && tentIsOpen && (airHumidity == 20) && (season != "зима")

    println(goodConditions)

}