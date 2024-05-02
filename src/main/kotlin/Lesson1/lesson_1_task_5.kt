package org.example.Lesson1

fun main(){
    var seconds  = 6480
    var minutes  = seconds / PART_OF_TIME
    val hours = minutes / PART_OF_TIME

    seconds %= PART_OF_TIME
    minutes %= PART_OF_TIME

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}
const val PART_OF_TIME = 60