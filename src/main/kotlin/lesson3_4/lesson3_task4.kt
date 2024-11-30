package org.example.lesson3_4

fun main() {
    var moveNumber = 0
    var startCellLetter = "E"
    var startCellNumber = 2

    println("$startCellLetter$startCellNumber-$startCellLetter${startCellNumber + 2};${ ++moveNumber }")

    startCellLetter = "D"
    startCellNumber = 2

    println("$startCellLetter$startCellNumber-$startCellLetter${startCellNumber + 1};${ ++moveNumber }")

}