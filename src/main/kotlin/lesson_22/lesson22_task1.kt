package org.example.lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val book1 = RegularBook("1984", "George Orwell")
    val book2 = RegularBook("1984", "George Orwell")

    val dataBook1 = DataBook("1984", "George Orwell")
    val dataBook2 = DataBook("1984", "George Orwell")

    // Сравниваем объекты обычного класса
    println("Сравнение RegularBook: ${book1 == book2}") // false

    // Сравниваем объекты data class
    println("Сравнение DataBook: ${dataBook1 == dataBook2}") // true
}

/*
    Разница в сравнении:
   - В обычном классе оператор == сравнивает ссылки на объекты, поэтому book1 и book2 считаются разными объектами.
   - В data class оператор == сравнивает значения свойств объектов, поэтому dataBook1 и dataBook2 считаются равными.
*/
