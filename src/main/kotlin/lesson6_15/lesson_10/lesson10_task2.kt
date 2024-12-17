package org.example.lesson_10

const val MIN_PASSWORD_LENGTH = 4
const val VALIDATION_OK_MSG = "Данные валидны.\nВы успешно зарегистрированы!!!"
const val VALIDATION_FAIL_MSG = "Логин или пароль недостаточно длинные!!!"

fun main() {
    print("Введите пароль: ")
    val userPassword = readln()
    print("Введите логин: ")
    val userLogin = readln()

    println(passwordCheck(userPassword, userLogin))
}

fun passwordCheck(userPassword: String, userLogin: String): String {
    return if (userPassword.length >= MIN_PASSWORD_LENGTH && userLogin.length >= MIN_PASSWORD_LENGTH) {
        VALIDATION_OK_MSG
    } else {
        VALIDATION_FAIL_MSG
    }
}