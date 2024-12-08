package org.example.lesson10_3

fun main() {
    print("Введите требуемую длину пароля: ")
    println(generatePassword(readln().toInt()))
}

fun generatePassword(pwdLen: Int): String {
    var symbolRange = (' '..'/')
    var intRange = ('0'..'9')
    var generatedPwd = ""

    for (i in 1..pwdLen) {
        if (i % 2 != 0) {
            generatedPwd += intRange.random()
        } else {
            generatedPwd += symbolRange.random()
        }
    }
    return generatedPwd
}