package org.example.lesson9_4

fun main() {
    println("Веедите 5 ингредиентов через \", \" (Запятую с пробелом)")

    val input = readln()
    println(input.split(", ").sorted())
}