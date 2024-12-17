package org.example.lesson_6

const val CAPTCHA_INFO: String = """
    ------------------------------------------------------
    Для дальнейшей авторизации необходимо пройти проверку.
    ------------------------------------------------------
"""

fun main() {
    var firstNum = 0
    var secondNum = 0
    var answer = 0
    var counter = 3
    var isCheckOver = false
    println(CAPTCHA_INFO.trimIndent())
    while (!isCheckOver) {
        counter--
        firstNum = (1 until 9).random()
        secondNum = (1 until 9).random()
        answer = firstNum * secondNum
        println(
            """
            Решите простой пример ( $firstNum * $secondNum = ____?)
            --------------------------------------------------------
        """.trimIndent()
        )
        print("Ваш ответ:  ")
        var userAnswer = readln().toInt()
        if (userAnswer == answer) {
            println("__________________Добро пожаловать!!!_____________")
            break
        } else if (counter > 0) {
            println("Ответ не верный. Оставшихся попыток $counter")
        } else {
            println("...........ДОСТУП ЗАПРЕЩЕН!!!!!!!...........")
            isCheckOver = true
        }

    }
}