package org.example.lesson_17

class User(private var _login: String, private var _password: String) {

    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин успешно изменен на \"$value\"")
        }

    var password: String
        get() = "*".repeat(_password.length)
        set(_) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {

    val user = User("myLogin", "myPassword123")

    println("Текущий логин: ${user.login}")
    user.login = "newLogin"

    println("Пароль: ${user.password}")

    user.password = "newPassword123"
}
