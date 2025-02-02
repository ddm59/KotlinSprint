data class DataBookCopy(val title: String, val author: String, val year: Int)

fun main() {
    val dataBook = DataBookCopy("1984 ", "George Orwell", 1949)

    println("Вывод DataBookCopy: $dataBook")

    val (title, author, year) = dataBook
    println("Название: $title")
    println("Автор: $author")
    println("Год: $year")
}


