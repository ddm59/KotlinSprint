package org.example.lesson7_5

const val PWD_GENERATOR_INSTRUCTION: String = """
    Введите желаемую длину пароля,
    минимальная длинна 6 символов
    -----------------------------------
  """

fun main() {
    val smallCharRange = 'a'..'z'
    val bigCharRange = 'A'..'Z'
    val digitRange = 0..9
    var counter = 0
    var generatedPwd = ""

    println(PWD_GENERATOR_INSTRUCTION.trimIndent())
    print("Введите длинну пароля: ")

    val pwdLength = readln().toInt()

    for (i in 1..pwdLength) {

        counter = (1..3).random()

        if (counter == 1) {
            generatedPwd += smallCharRange.random()
        } else if (counter == 2) {
            generatedPwd += bigCharRange.random()
        } else {
            generatedPwd += digitRange.random()
        }
    }
    println("Сгенерированный пароль: $generatedPwd")
}