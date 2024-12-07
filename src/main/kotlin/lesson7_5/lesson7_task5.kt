package org.example.lesson7_5

const val PWD_GENERATOR_INSTRUCTION: String = """
    Введите желаемую длину пароля,
    минимальная длинна 6 символов
    -----------------------------------
  """

fun main() {
    val smallCharRange = 'a'..'z'
    val bigCharRange = 'A'..'Z'
    val digitRange = '0'..'9'
    var pwdSymbolsPool = mutableListOf<Char>()
    val generatedPWD = mutableListOf<Char>()

    generatedPWD.add(smallCharRange.random())
    generatedPWD.add(bigCharRange.random())
    generatedPWD.add(digitRange.random())

    pwdSymbolsPool.addAll(smallCharRange)
    pwdSymbolsPool.addAll(bigCharRange)
    pwdSymbolsPool.addAll(digitRange)
    pwdSymbolsPool.shuffle()

    println(PWD_GENERATOR_INSTRUCTION.trimIndent())
    print("Введите длинну пароля: ")
    val pwdLength = readln().toInt()

    for (i in 1..pwdLength-3) {
        generatedPWD.add(pwdSymbolsPool.random())
    }

    generatedPWD.shuffle()
    println("Сгенерированный пароль: ${generatedPWD.joinToString("")}")
}