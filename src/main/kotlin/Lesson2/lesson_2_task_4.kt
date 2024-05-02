package org.example.Lesson2

fun main(){
    val baff =20
    val cristalOre = 7
    val ironOre = 11

    val cristalOreBaff = cristalOre * baff / PERCENT
    val ironOreBaff = ironOre * baff / PERCENT

    println("Бонусных кристаллов: $cristalOreBaff")
    println("Бонусного железа: $ironOreBaff")


}

const val PERCENT = 100