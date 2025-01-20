package org.example.lesson_16

class User(private val userLogin: String, private val userPassword: String) {

    fun validatePassword(password: String): Boolean {
        return userPassword == password
    }
}

fun main() {
    val user = User("admin", "<PASSWORD>")

    println(" Пароль введен ${if (user.validatePassword("PASSWORD")) "верно" else "не верно"}")

    println(" Пароль введен ${if (user.validatePassword("<PASSWORD>")) "верно" else "не верно"}")
}