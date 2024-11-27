package org.example.lesson2_5

import kotlin.math.pow

fun main() {
    val initialAmount = 70000.0
    val yearPercentRate = 16.7 / 100
    val periodInYears = 20
    val numberOfChargesInYear = 1

    val result =
        initialAmount * (1 + yearPercentRate / numberOfChargesInYear).pow(numberOfChargesInYear * periodInYears)

    println(String.format("%.3f", result))


}