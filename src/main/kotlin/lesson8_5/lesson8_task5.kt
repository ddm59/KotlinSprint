package org.example.lesson8_5

fun main() {

    print("Введи кол-во ингредиентов в рецепте:  ")
    val recipeSize = readln().toInt()
    var recipeIngridients: Array<String> = Array(recipeSize) { "" }

    for (i in 0..recipeSize - 1) {

        print("Ингредиент №${i + 1}\nВведите наименование ингредиента: ")
        recipeIngridients[i] = readln()
    }
    println("Состав введенного рецепта: ${recipeIngridients.joinToString(", ")}")
}