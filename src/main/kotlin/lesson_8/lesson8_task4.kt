package org.example.lesson_8

fun main() {

    val recipeIngredients = arrayOf("лук", "сыр", "помидор", "масло", "картофель")
    var newIngredient = ""

    println(recipeIngredients.contentToString())
    print("Введите ингредиент для замены: ")

    val ingredientToChange = readln()
    val ingredientIndex = recipeIngredients.indexOf(ingredientToChange)

    if (ingredientIndex >= 0) {

        print("Введите новый ингредиент: ")
        newIngredient = readln()

        recipeIngredients[ingredientIndex] = newIngredient
    } else {
        println("Ингредиент не найден")
    }
    println(recipeIngredients.contentToString())

}