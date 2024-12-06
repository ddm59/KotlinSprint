package org.example.lesson8_3

fun main() {
    val recipeIngredients = arrayOf("Перец", "Помидоры","Чеснок"," Картофель", "Лук", "Говядина")

    print("Введите название ингредиента для поиска:  ")
    var ingredientName = readln()
    var ingredientIndex = 0

    if (ingredientName in recipeIngredients) {

        ingredientIndex = recipeIngredients.indexOf(ingredientName)
        println("Ингредиент [${recipeIngredients[ingredientIndex]}] в рецепте есть")

    }else{
        println("Такого ингредиента в рецепте нет")
    }
}
