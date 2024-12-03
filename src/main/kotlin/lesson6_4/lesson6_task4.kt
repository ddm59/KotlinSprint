package org.example.lesson6_4

const val GREETINGS: String = """
   
    Добро пожаловать в лотерею Lucky Numbers!!!
    Правила просты: 
      -Необходимо угадать число от 1 до 9
      -У вас есть 5 попыток
    Желаем удачи!!!!!
    
"""

fun main() {
    var counter = 5
    var guessedNumber = 0
    var isLotteryOver = false
    var luckyNumber = (1 until 9).random()
    println(GREETINGS.trimIndent())
    while (!isLotteryOver) {
        counter--
        print("---------------------------------\nВведите число:  ")
        guessedNumber = readln().toInt()
        if (guessedNumber == luckyNumber) {
            println("***********ВЫ УГАДАЛИ!!!!*********")
            println("*********Это была великолепная игра!!!!***********")
            break
        } else if (counter > 0) {
            println("Вы не угадали. Осталось $counter попыток")
        } else {
            println("...........Вы потратили все попытки...........")
            println("Было загадано чило $luckyNumber")
            isLotteryOver = true
        }

    }
}