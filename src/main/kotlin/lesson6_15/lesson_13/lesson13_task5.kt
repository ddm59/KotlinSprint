package org.example.lesson6_15.lesson_13


class UserContact(
    private val name: String,
    private val phoneNumber: Long?,
    private val company: String?
) {
    fun display() {
        println("Название: $name, Номер: ${phoneNumber ?: "Не корректные данные"}, Компания: ${company ?: "Поле не заполнено"}")
    }
}

fun main() {
    var phoneNumber: Long? = null

    println("Введите Имя:")
    val name = readln().trim()

    println("Введите номер телефона:")
    val phoneInput = readln().trim()

    try {
        phoneNumber = phoneInput.toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: $e")
    }

    println("Введите название компании (либо оставьте поле пустым):")
    val company = readln().trim().ifEmpty { null }

    val userContact = UserContact(name, phoneNumber, company)
    userContact.display()
}