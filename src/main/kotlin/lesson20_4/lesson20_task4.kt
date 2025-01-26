package org.example.lesson20_4

fun main() {
    val elements = listOf("Элемент1", "Элемент2", "Элемент3", "Элемент4", "Элемент5")

    val lambdas = elements.map { element ->
        { println("Нажат элемент $element") }
    }

    lambdas.forEachIndexed { index, lambda ->
        if ((index + 1) % 2 == 0) {
            lambda()
        }
    }
}