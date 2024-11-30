package org.example.lesson_3

fun main() {
    val moveData = "D2-D4;0"

    //var startPossition = moveData.split("-", ";")[0]
    //var nextPossition = moveData.split("-", ";")[1]
    //var moveNumber = moveData.split("-", ";")[2].toInt()

    //println(startPossition)
    //println(nextPossition)
    //println(moveNumber)

    var possitionList = moveData.split("-", ";")

    println(possitionList[0])
    println(possitionList[1])
    println(possitionList[2])

}