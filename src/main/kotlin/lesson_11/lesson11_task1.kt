package org.example.lesson_11

fun main() {
    val user1 = User3(
        id = 1,
        login = "looney",
        password = "Qwerty2024",
        email = "looney2024@gmail.com",
    )

    val user2 = User3(
        id = 2,
        login = "Johny",
        password = "QET123adg!!",
        email = "johnyboy@mail.ru",
    )
    println("Данные user1")
    println("ID: ${user1.id}\nLogin: ${user1.login}\nPassword: ${user1.password}\nEmail: ${user1.email}")
    println("Данные user2")
    println("ID: ${user2.id}\nLogin: ${user2.login}\nPassword: ${user2.password}\nEmail: ${user2.email}")
}

class User3(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)