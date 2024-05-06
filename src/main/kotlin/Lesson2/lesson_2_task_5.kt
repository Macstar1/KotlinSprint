package org.example.Lesson2

import kotlin.math.pow

fun main(){
    val deposit = 70_000
    val depositTime = 20.0

    val depositAmound = deposit * ((1 + INTEREST_RATE / 100)).pow(depositTime)
    println("Размер вклада через ${depositTime.toInt()} лет: %.3f".format(depositAmound))
}
const val INTEREST_RATE = 16.7