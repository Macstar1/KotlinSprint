package org.example.Lesson4

fun main() {
    val dayOfTraining = 5
    var isParity = (dayOfTraining % 2) == 0

    println(
        """
         Упражнения для рук:    ${!isParity}
         Упражнения для ног:    ${isParity} 
         Упражнения для спины:  ${isParity} 
         Упражнения для пресса: ${!isParity}
    """.trimIndent()
    )

}