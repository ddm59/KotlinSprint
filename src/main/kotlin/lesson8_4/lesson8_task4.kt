package org.example.lesson8_4

fun main() {

    val recipeIngredients = arrayOf("лук","сыр","помидор","масло","картофель")
    var newIngredient =""
    var ingredientIndex= 0

    println(recipeIngredients.contentToString())
    print("Введите ингредиент для замены: ")

    val ingredientToChange = readln()

    if (recipeIngredients.contains(ingredientToChange)) {
        ingredientIndex =recipeIngredients.indexOf(ingredientToChange)

        print("Введите новый ингредиент: ")
        newIngredient = readln()

        recipeIngredients[ingredientIndex]= newIngredient
    }else{
        println("Ингредиент не найден")
    }
    println(recipeIngredients.contentToString())

}