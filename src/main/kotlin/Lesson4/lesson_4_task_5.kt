package org.example.Lesson4

fun main() {
    print("Корабль имеет повреждения? (true/false): ")
    val shipDamage = readLine().toBoolean()
    print("Текущий состав экипажа: ")
    val shipCrew = readLine()?.toInt()
    print("Количество ящиков с провизией: ")
    val food = readLine()?.toInt()
    print("Метеоусловия благоприятны? (true/false): ")
    val weather = readLine().toBoolean()
    val shipIsReady =
        (!shipDamage && (MIN_CRUE_VALUE <= shipCrew!!) && (shipCrew <= MAX_CRUE_VALUE) && (food!! > FOOD) && weather) || (shipDamage && (shipCrew == MAX_CRUE_VALUE) && weather && (food!! >= FOOD))

    println("Гтовность корабля: $shipIsReady")

}

const val MAX_CRUE_VALUE = 70
const val MIN_CRUE_VALUE = 55
const val FOOD = 50