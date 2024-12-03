package org.example.lesson_5

const val FIRST_LUCKY_NUMBER: Int = 35
const val SECOND_LUCKY_NUMBER: Int = 10
const val RULES_MSG: String = """
        Рады приветствовать вас в лотерее "Lucky numbers"!
        Испытайте свою удачу и угадайте два загаданных числа в диапазоне от 0 до 42.
    """

fun main() {

    println(RULES_MSG.trimIndent())
    println("Введите первое число:")
    var firstNum = readln().toInt()
    println("Отлично, вы на пол пути к победе.\nВведите второе число:")
    var secondNum = readln().toInt()

    var fullPrizeCheck: Boolean =
        (firstNum == FIRST_LUCKY_NUMBER || firstNum == SECOND_LUCKY_NUMBER) && (secondNum == FIRST_LUCKY_NUMBER || secondNum == SECOND_LUCKY_NUMBER)
    var halfPrizeCheck: Boolean =
        (firstNum == FIRST_LUCKY_NUMBER || firstNum == SECOND_LUCKY_NUMBER) || (secondNum == FIRST_LUCKY_NUMBER || secondNum == SECOND_LUCKY_NUMBER)

    when {
        (fullPrizeCheck) -> {
            println("Поздравляем! Вы выиграли главный приз!")
            println("Загаданные числа: $FIRST_LUCKY_NUMBER  и $SECOND_LUCKY_NUMBER")
        }

        (halfPrizeCheck) -> {
            println("Вы выиграли утешительный приз!")
            println("Загаданные числа: $FIRST_LUCKY_NUMBER  и $SECOND_LUCKY_NUMBER")
        }

        else -> {
            println("Неудача!")
            println("Загаданные числа: $FIRST_LUCKY_NUMBER  и $SECOND_LUCKY_NUMBER")
        }
    }
}