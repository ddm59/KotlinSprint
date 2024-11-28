package org.example.lesson3_5

fun main() {
    var moveData = "D2-D4;0"

    var startPossition = moveData.split("-", ";")[0]
    var nextPossition = moveData.split("-", ";")[1]
    var moveNumber = moveData.split("-", ";")[2].toInt()

    println(startPossition)
    println(nextPossition)
    println(moveNumber)

}