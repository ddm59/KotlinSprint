package org.example.lesson10_3

fun main() {
    print("Введите требуемую длину пароля: ")
    println(pwdGenerator(readln().toInt()))
}

fun pwdGenerator(pwdLen: Int): String {
    var symbolRange = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    var intRange = ('0'..'9').toList()
    var generatedPwd = mutableListOf<Char>()

    for (i in 1..pwdLen) {

        if (i % 2 != 0) {
            intRange.shuffled()
            generatedPwd.add(intRange.random())
        } else {
            symbolRange.shuffled()
            generatedPwd.add(symbolRange.random())
        }
    }
    return generatedPwd.joinToString("")
}