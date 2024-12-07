package org.example.lesson8_2

fun main() {
    val recipeIngredients = arrayOf("Перец", "Помидоры","Чеснок"," Картофель", "Лук", "Говядина")

    print("Введите название ингредиента для поиска:  ")
    var ingredientName = readln()

    for(el in recipeIngredients){
        if(el == ingredientName) {
            println("Ингредиент [$el] в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}