package org.example.lesson_22

class RegularBookCopy(val title: String, val author: String)

data class DataBookCopy(val title: String, val author: String)

fun main() {
    val book = RegularBookCopy("1984", "George Orwell")
    val dataBook = DataBookCopy("1984", "George Orwell")

    // Вывод объектов в консоль
    println("Вывод RegularBookCopy: $book")
    println("Вывод DataBookCopy: $dataBook")
}
/*
   Разница в выводе:
   - Обычный класс не переопределяет метод toString(), поэтому выводится ссылка на объект.
   - Data class автоматически генерирует метод toString(), который выводит значения полей.
*/