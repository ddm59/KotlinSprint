package org.example.lesson_11

fun main() {
    val user = User2(
        id = 1,
        login = "Anonymous",
        password = "QWERty!234",
        email = "AnonDev@gmail.com",
        bio = ""
    )
    user.getInfo()
    user.setBio()
    user.changePassword()
    user.getInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun getInfo() {
        println("Информация о пользователе:")
        println("id: $id\nlogin: $login\npassword: $password\nemail: $email\nБиография: $bio")
    }

    fun setBio() {
        println("Введите биографию пользователя: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()

        if (currentPassword == password) {
            print("Введите новый пароль: ")
            val newPassword = readln()

            println("Повторите новый пароль: ")
            val repeatNewPassword = readln()

            if (newPassword == repeatNewPassword) {
                password = newPassword
                println("Пароль успешно изменен....")
            } else {
                println("Пароли не совпадают!!!")
                return
            }
        } else {
            println("Не верный пароль!!!")
            return
        }
    }
}