package org.example.lesson_3

fun main() {
    val moveData = "D2-D4;0"

    var possitionList = moveData.split("-", ";")

    println(possitionList[0])
    println(possitionList[1])
    println(possitionList[2])

}