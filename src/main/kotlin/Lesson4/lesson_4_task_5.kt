package org.example.Lesson4

fun main() {
    print("Корабль имеет повреждения? (true/false): ")
    val isShipDamage = readln().toBoolean()
    print("Текущий состав экипажа: ")
    val shipCrew = readln().toInt()
    print("Количество ящиков с провизией: ")
    val food = readln().toInt()
    print("Метеоусловия благоприятны? (true/false): ")
    val isWeatherGood = readln().toBoolean()
    val shipIsReady =
        (!isShipDamage && (MIN_CREW_VALUE <= shipCrew) && (shipCrew <= MAX_CREW_VALUE) && (food > FOOD) &&
                isWeatherGood) || (isShipDamage && (shipCrew == MAX_CREW_VALUE) && isWeatherGood && (food >= FOOD))

    println("Готовность корабля: $shipIsReady")

}

const val MAX_CREW_VALUE = 70
const val MIN_CREW_VALUE = 55
const val FOOD = 50