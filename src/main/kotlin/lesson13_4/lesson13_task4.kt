package org.example.lesson13_4

class ContactEntry(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String?
) {
    // Метод для отображения объекта
    fun display() {
        println("Название: $name, Номер: $phoneNumber, Компания: ${company ?: "Поле не заполнено"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<ContactEntry>()

    println("Введите контакты для внесения в тел. книгу либо введите 'exit' для выхода.")

    while (true) {
        println("Введите Имя (или введите 'exit' для выхода):")
        val name = readln().trim()
        if (name.equals("exit", ignoreCase = true)) break

        println("Введите номер телефона:")
        val phoneInput = readln().trim()
        val phoneNumber = phoneInput.toLongOrNull()

        if (phoneNumber == null) {
            println("Номер отсутствует либо введен не верно. Запись не будет добавлена.")
            continue
        }

        println("Введите название компании (либо оставьте поле пустым):")
        val company = readln().trim().ifEmpty { null }

        // Создаем и добавляем запись в телефонную книгу
        phoneBook.add(ContactEntry(name, phoneNumber, company))
    }

    println("\nКонтакты справочника:")
    phoneBook.forEach { it.display() }
}