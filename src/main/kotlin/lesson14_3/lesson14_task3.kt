package org.example.lesson14_3
const val BLACK_COLOR: String = "Черный"
const val  WHITE_COLOR: String = "Белый"

fun main() {
    val figures: List<Figure> = listOf(
        Circle(WHITE_COLOR, 2.0),
        Rectangle(BLACK_COLOR, 3.0, 4.0),
        Circle(BLACK_COLOR, 6.0),
        Rectangle(WHITE_COLOR, 8.0, 5.0),
    )

    val totalBlackPerimeter = figures.filter { it.color == BLACK_COLOR }.sumOf { it.calculatePerimeter() }
    val totalWhiteArea = figures.filter { it.color == WHITE_COLOR }.sumOf { it.calculateArea() }

    println("Сумма периметров всех черных фигур: $totalBlackPerimeter")
    println("Сумма площадей всех белых фигур: $totalWhiteArea")
}

class Circle(color: String, private val radius: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * radius * Math.PI
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (height * width)
    }
}

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}