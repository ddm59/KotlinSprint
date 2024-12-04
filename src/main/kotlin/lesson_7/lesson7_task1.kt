package org.example.lesson_7

fun main() {
    var generatedPassword = ""
    var intRange = 0..9
    var charRange = 'a'..'z'

    for (i in 1..3) {
        generatedPassword += charRange.random()
        generatedPassword += intRange.random()
    }
}