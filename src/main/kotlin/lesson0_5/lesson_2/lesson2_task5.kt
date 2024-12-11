package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val initialAmount = 70000
    val yearPercentRate = 16.7
    val periodInYears = 20
    val numberOfChargesInYear = 1

    val result =
        initialAmount.toFloat() * (1 + (yearPercentRate / 100) / numberOfChargesInYear).pow(numberOfChargesInYear * periodInYears)

    println(String.format("%.3f", result))


}