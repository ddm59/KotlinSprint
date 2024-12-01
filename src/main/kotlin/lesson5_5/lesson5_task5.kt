package org.example.lesson5_5

const val JACKPOT: Int = 3
const val BIG_PRIZE: Int = 2
const val SMALL_PRIZE: Int = 1
const val RULES_MSG: String = """
        Рады приветствовать вас в лотерее "Lucky numbers"!
        Испытайте свою удачу и угадайте три загаданных числа в диапазоне от 0 до 42.
    """

fun main() {
    val luckyNumbers = List(3) { (0 until 43).random() }
    var userNumbers = mutableListOf<Int>()
    var listLen: Int

    println(RULES_MSG.trimIndent())
    println("Введите первое число:")
    userNumbers.add(readln().toInt())
    println("Введите второе число:")
    userNumbers.add(readln().toInt())
    println("Введите третье число:")
    userNumbers.add(readln().toInt())

    listLen = userNumbers.intersect(luckyNumbers).size

    when {
        (listLen == JACKPOT) -> {
            println("Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!!!")
            println("Выигрышные числа: $luckyNumbers")
        }

        (listLen == BIG_PRIZE) -> {
            println("Поздравляем! Вы угадали два числа и выиграли крупный приз!!!")
            println("Выигрышные числа: $luckyNumbers")
        }

        (listLen == SMALL_PRIZE) -> {
            println("Поздравляем! Вы угадали одно число и выиграли утешительный приз!!!")
            println("Выигрышные числа: $luckyNumbers")
        }

        else -> {
            println("Вы не угадали ни одного числа!")
            println("Выигрышные числа: $luckyNumbers")
        }
    }
}