package org.example.lesson2_4

fun main() {
    var crystalOre: Int = 7
    var ironOre: Int = 11
    var percentModifier: Float = 0.2f
    println("Колличество добытых ресурсов: ")
    println("----Кристалическая руда: $crystalOre")
    println("----Железная руда: $ironOre")
    println("Бафф +20% к добытым ресурсам: ")
    println("----Кристалическая руда: " + (crystalOre * percentModifier).toInt())
    println("----Железная руда: " + (ironOre * percentModifier).toInt())
}