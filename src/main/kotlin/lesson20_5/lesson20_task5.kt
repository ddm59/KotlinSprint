package org.example.lesson20_5

class Robot {

    private val phrases = listOf(
        "Привет, я робот!",
        "Как ваши дела?",
        "Я готов к работе!",
        "Обработка данных завершена.",
        "Погода сегодня отличная!"
    )

    private var speechModifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        speechModifier = modifier
    }

    fun say() {
        // Выбираем случайную фразу и применяем модификатор
        val phrase = phrases[phrases.indices.random()]
        println(speechModifier(phrase))
    }
}

fun main() {
    val robot = Robot()

    println("Робот говорит в обычном режиме:")
    robot.say()

    robot.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    println("\nРобот говорит с модификатором (инверсия слов):")
    robot.say()
}
