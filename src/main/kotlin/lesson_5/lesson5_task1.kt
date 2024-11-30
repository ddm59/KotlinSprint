package org.example.lesson_5


fun main() {

    println("Для продолжения авторизации необходимо пройти проверку....")
    println("Чему равен результат выражения ( 350 + 35 ) ?")

    val answer = readln().toInt()

    if (answer == 385) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!!!")
    }

}