package org.example.lesson9_5

fun main() {
    println("Введите 5 ингредиентов: ")
    val ingredientsSet: Set<String> = buildSet {
        for (i in 1..5) {
            add(readln())
        }
    }

    println(
        "Состав рецепта: ${
        ingredientsSet
            .toList()
            .sorted()
            .joinToString(",")
            .replaceFirstChar { it.uppercase() }
    }"
    )
}