package org.example.Lesson3

fun main() {
    val move = "D2-D4;0"
    val split = move.split("-", ";")
    val from = split[0]
    val to = split[1]
    val number = split[2]

    println(move)
    println(
        """
        С клетки $from
        На клетку $to
        Ход номер $number
    """.trimIndent()
    )
}