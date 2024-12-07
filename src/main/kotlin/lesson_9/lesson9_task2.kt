package org.example.lesson_9

fun main() {

    var recipeIngredients = mutableListOf("Хлеб", "Помидоры", "Сыр")
    var userAnswer = ""

    println("В рецепте есть базовые ингредиенты: $recipeIngredients")
    print("Желаете добавить еще?:  ")
    userAnswer = readln()

    if (userAnswer.lowercase().equals("да")) {
        print("Какой ингредиент хотите добавить?:  ")
        recipeIngredients.add(readln())
    } else {
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: $recipeIngredients")
}