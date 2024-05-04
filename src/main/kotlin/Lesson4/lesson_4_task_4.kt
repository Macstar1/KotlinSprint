package org.example.Lesson4

fun main() {
    val dayOfTraining = 5
    var parity = dayOfTraining % 2

    println(
        """
         Упражнения для рук:    ${parity == 1} 
         Упражнения для ног:    ${parity == 0} 
         Упражнения для спины:  ${parity == 0} 
         Упражнения для пресса: ${parity == 1}
    """.trimIndent()
    )

}