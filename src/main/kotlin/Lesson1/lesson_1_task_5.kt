package org.example.Lesson1

fun main(){
    var seconds  = 6480
    var minutes  = seconds / 60
    val hours = minutes / 60

    seconds %= 60
    minutes %= 60

    val finalSeconds = String.format("%02d", seconds)
    val finalMinutes = String.format("%02d", minutes)

    println("$hours:$finalMinutes:$finalSeconds")

}