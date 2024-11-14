package org.example.lesson2_4

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    println("Колличество добытых ресурсов: ")
    println("----Кристалическая руда: $crystalOre")
    println("----Железная руда: $ironOre")
    println("Бафф +20% к добытым ресурсам: ")
    println("----Кристалическая руда: " + (crystalOre * 0.2).toInt())
    println("----Железная руда: " + (ironOre * 0.2).toInt())
}