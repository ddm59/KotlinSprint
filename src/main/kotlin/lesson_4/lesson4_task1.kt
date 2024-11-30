package org.example.lesson4_1

const val NUMBER_OF_TABLES: Int = 13

fun main() {

    var reservedForToday = 13
    var reservedForTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${reservedForToday < NUMBER_OF_TABLES}\n " +
                "Доступность столиков на завтра: ${reservedForTomorrow < NUMBER_OF_TABLES}"
    )

}