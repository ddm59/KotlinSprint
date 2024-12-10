package org.example.lesson11_2

class User2(
    val id: Int,
    var login: String,
    var password: String,
    var email: String,
    var bio: String,
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