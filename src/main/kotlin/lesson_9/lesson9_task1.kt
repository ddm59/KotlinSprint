package org.example.lesson_9

fun main() {

    val recipeIngredients = listOf("bread", "butter", "sugar", "egg")

    println("В рецепте есть следующие ингредиенты: $recipeIngredients")
    recipeIngredients.forEach { println(it) }

}