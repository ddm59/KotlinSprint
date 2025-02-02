package org.example.lesson_16

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius * radius
    }
}

fun main() {

    val circle = Circle(5.0)

    println("Длина окружности: ${circle.calculateCircumference()}")
    println("Площадь круга: ${circle.calculateArea()}")
}