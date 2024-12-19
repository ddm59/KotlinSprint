package org.example.lesson6_15.lesson_13

fun main() {
    val userContacts = PhoneDirectory("Андрей", 12123472536235)
    userContacts.getInfo()
}


class PhoneDirectory(
    val userName: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {
    fun getInfo() {
        println("-Имя: $userName\n-Номер: $phoneNumber\n-Компания: ${companyName ?: "<не указано>"}")
    }
}