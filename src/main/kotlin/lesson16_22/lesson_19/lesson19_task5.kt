package org.example.lesson_19

enum class Gender(val description: String) {
    MALE("Мужской"),
    FEMALE("Женский");

    companion object {
        fun fromInput(input: String): Gender? {
            return entries.find { it.name.equals(input, ignoreCase = true) }
        }
    }
}

data class Person(val name: String, val gender: Gender)

fun main() {
    val people = mutableListOf<Person>()
    println("Добро пожаловать в приложение 'Картотека'!")
    println("Инструкция: Введите имя и пол человека в формате:")
    println("Имя Пол (например: Иван MALE или Анна FEMALE)")
    println("Доступные значения для пола: ${Gender.entries.joinToString(", ") { it.name }}")
    println("Введите данные для 5 человек:")

    repeat(5) {
        while (true) {
            print("Введите имя и пол для человека ${it + 1}: ")
            val input = readlnOrNull()?.trim()
            if (input.isNullOrEmpty()) {
                println("Пустая строка! Попробуйте снова.")
                continue
            }

            val parts = input.split(" ")
            if (parts.size != 2) {
                println("Неверный формат ввода. Попробуйте снова.")
                continue
            }

            val (name, genderInput) = parts
            val gender = Gender.fromInput(genderInput)

            if (gender == null) {
                println("Неверное значение пола. Доступные значения: ${Gender.entries.joinToString(", ") { it.name }}")
                continue
            }

            people.add(Person(name, gender))
            break
        }
    }

    println("\nКартотека людей:")
    people.forEachIndexed { index, person ->
        println("${index + 1}. Имя: ${person.name}, Пол: ${person.gender.description}")
    }
}