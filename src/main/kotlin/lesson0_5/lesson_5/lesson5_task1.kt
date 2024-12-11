package org.example.lesson_5
const val FIRST_CAPTCHA_NUM: Int = 350
const val SECOND_CAPTCHA_NUM: Int = 35

fun main() {

    println("Для продолжения авторизации необходимо пройти проверку....")
    println("Чему равен результат выражения ( $FIRST_CAPTCHA_NUM + $SECOND_CAPTCHA_NUM ) ?")

    val answer = readln().toInt()

    if (answer == (FIRST_CAPTCHA_NUM+ SECOND_CAPTCHA_NUM)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!!!")
    }

}