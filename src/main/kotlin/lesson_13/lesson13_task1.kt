package org.example.lesson_13

fun main() {
    val book = PhoneBook("John", 9987987987981791, null)

    println(
        """
        Имя:               ${book.userName}
        Номер телефона:    ${book.phoneNumber}
        Название компании: ${book.companyName}
    """.trimIndent()
    )
}

class PhoneBook(val userName: String, val phoneNumber: Long, val companyName: String?)
