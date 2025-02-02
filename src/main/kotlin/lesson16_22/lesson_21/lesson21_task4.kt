package org.example.lesson_21

import java.io.File


fun File.prependText(word: String) {

    val lowerCaseWord = word.lowercase()

    val existingContent = if (this.exists()) this.readText() else ""

    val newContent = lowerCaseWord + "\n" + existingContent

    this.writeText(newContent)
}

fun main() {

    val file = File("words.txt")

    file.prependText("Hello")
    file.prependText("World")
    file.prependText("Kotlin")

    println("Содержимое файла:")
    println(file.readText())
}