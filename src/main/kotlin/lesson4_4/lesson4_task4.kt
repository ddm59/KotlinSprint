package org.example.lesson4_4

fun main() {

    var dayCount = 5
    var isOddDay = dayCount % 2 != 0
    var isEvenDay = dayCount % 2 == 0

    println(
        """
        |Упражнения для рук:    $isOddDay
        |Упражнения для ног:    $isEvenDay
        |Упражнения для спины:  $isEvenDay
        |Упражнения для пресса: $isOddDay
    """.trimMargin()
    )
}