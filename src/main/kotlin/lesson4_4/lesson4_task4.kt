package org.example.lesson4_4

fun main() {

    var dayCount = 5

    println(
        """
        |Упражнения для рук:    ${(dayCount % 2 != 0)}
        |Упражнения для ног:    ${(dayCount % 2 == 0)}
        |Упражнения для спины:  ${(dayCount % 2 == 0)}
        |Упражнения для пресса: ${(dayCount % 2 != 0)}
        
    """.trimMargin()
    )
}