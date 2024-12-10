package org.example.lesson11_2

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