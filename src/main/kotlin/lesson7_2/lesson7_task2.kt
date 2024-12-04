package org.example.lesson7_2

import kotlin.concurrent.thread

const val AUTH_GREETINGS = "Вы успешно авторизованы!!!\nДобро пожаловать."
fun main() {
    var authCode = 0
    var userCode = 0

    while (true) {
        authCode = (1000..9999).random()
        println("Ваш код активации: $authCode")
        Thread.sleep(2000)                     //Добавил просто для имитации времени  ответа
        print("Введите код активации: ")
        userCode = readln().toInt()

        if (authCode == userCode) {
            println(AUTH_GREETINGS)
            break
        } else {
            println("Не верный код")
        }
    }
}