package org.example.lesson_10

const val TOKEN_LENGTH = 32
const val USER_LOGIN = "User32"
const val USER_PASSWORD = "Pas123321"


fun main() {

    print("Вход в систему.........\nLogin: ")
    val userLogin = readln()
    print("Password: ")
    val userPassword = readln()

    var result: Array<String>? = getCart(authorizeUser(userPassword, userLogin))

    if (result != null) {
        println("В вашей корзине: ${result.joinToString(", ")}")
    } else {
        println("Ошибка авторизации!!!!\nНеверный логин или пароль!!!")
    }
}

fun generateToken(): String {
    var smallSymbolRange = ('a'..'z')
    var bigSymbolRange = ('A'..'Z')
    var numbersRange = ('0'..'9')
    return (smallSymbolRange + bigSymbolRange + numbersRange).shuffled().take(TOKEN_LENGTH).joinToString("")
}

fun authorizeUser(password: String, login: String): String? {
    return if (login == USER_LOGIN && password == USER_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String?): Array<String>? {
    val userCart = arrayOf("Bananas", "Milk", "Ice Cream")

    return if (token != null && token.length == 32) {
        userCart
    } else {
        null
    }
}