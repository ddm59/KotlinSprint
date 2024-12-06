package org.example.lesson9_3

fun main() {
    var recipeProportions = listOf(2, 50, 15)
    print("Введите кол-во порция для расчета:  ")

    val numberOfPortions = readln().toInt()
    recipeProportions = recipeProportions.map { it * numberOfPortions }

    println("На $numberOfPortions порций вам понадобится:")
    println("Яиц - ${recipeProportions[0]} шт., Молока - ${recipeProportions[1]} мл., Сливочного масла - ${recipeProportions[2]} гр.")
}