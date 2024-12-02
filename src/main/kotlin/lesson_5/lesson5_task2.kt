package org.example.lesson_5

const val MAJORITY_AGE = 18
const val CURRENT_YEAR = 2024

fun main() {

    println("Введите год вашего рождения: ")

    val userBirthDate = readln().toInt()
    val userAge = CURRENT_YEAR - userBirthDate

    if (userAge >= MAJORITY_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Показать экран с общедоступным контентом")
    }


}