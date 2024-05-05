package org.example.Lesson4

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "зима"
    val goodConditions = isSunny && isAwningOpen && (airHumidity == GOOD_HUMIDITY) && (season != BAD_SEASON)

    println(goodConditions)

}

const val GOOD_HUMIDITY = 20
const val BAD_SEASON = "зима"
