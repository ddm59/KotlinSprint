package org.example.lesson_21

fun String.vowelCount(): Int {

    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')

    return this.lowercase().count { it in vowels }
}

fun main() {

    val word1 = "hello world"
    val word2 = "привет"
    val word3 = "Kotlin"

    println("Гласных в \"$word1\": ${word1.vowelCount()}")
    println("Гласных в \"$word2\": ${word2.vowelCount()}")
    println("Гласных в \"$word3\": ${word3.vowelCount()}")
}