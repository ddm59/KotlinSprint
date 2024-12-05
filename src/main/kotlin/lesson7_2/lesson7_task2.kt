package org.example.lesson7_2

import kotlin.concurrent.thread

const val AUTH_GREETINGS = "Вы успешно авторизованы!!!\nДобро пожаловать."
fun main() {
    var authCode = 0
    var userCode = 0

    do {
        authCode = (1000..9999).random()

        println("Ваш код активации: $authCode")
        print("Введите код активации: ")

        userCode = readln().toInt()

    } while (authCode != userCode)
    println(AUTH_GREETINGS)
}

