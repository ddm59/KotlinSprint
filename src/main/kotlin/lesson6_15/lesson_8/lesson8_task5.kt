package org.example.lesson_8

fun main() {

    print("Введи кол-во ингредиентов в рецепте:  ")

    var recipeIngridients: Array<String> = Array(readln().toInt()) {
        println("Введите наименование ингредиента: ")
        readln()
    }
    println("Состав введенного рецепта: ${recipeIngridients.joinToString(", ")}")
}