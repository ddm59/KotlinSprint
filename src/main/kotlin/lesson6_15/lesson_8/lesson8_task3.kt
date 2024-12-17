package org.example.lesson_8

fun main() {
    val recipeIngredients = arrayOf("Перец", "Помидоры", "Чеснок", " Картофель", "Лук", "Говядина")

    print("Введите название ингредиента для поиска:  ")
    var ingredientName = readln()

    if (ingredientName in recipeIngredients) {
        println("Ингредиент [${ingredientName}}] в рецепте есть")

    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
