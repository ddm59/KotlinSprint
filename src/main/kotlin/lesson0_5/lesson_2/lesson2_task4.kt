package org.example.lesson_2

fun main() {

    var crystalOre = 7
    var ironOre = 11
    var percentModifier = 20


    var crystalOreBuff = (crystalOre * (percentModifier.toFloat() / 100)).toInt()
    var ironOreBuff = (ironOre * (percentModifier.toFloat() / 100)).toInt()


    println("Колличество добытых ресурсов: ")
    println("----Кристалическая руда: $crystalOre")
    println("----Железная руда: $ironOre")
    println("Бафф +20% к добытым ресурсам: ")
    println("----Кристалическая руда: $crystalOreBuff")
    println("----Железная руда: $ironOreBuff")
}