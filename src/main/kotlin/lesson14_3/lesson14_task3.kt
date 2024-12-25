package org.example.lesson14_3

fun main() {
    val figures: List<Figure> = listOf(
        Circle("Белый", 2.0),
        Rectangle("Черный", 3.0, 4.0),
        Circle("Черный", 6.0),
        Rectangle("Белый", 8.0, 5.0),
    )

    val totalBlackPerimeter = figures.filter { it.color == "Черный" }.sumOf { it.calculatePerimeter() }
    val totalWhiteArea = figures.filter { it.color == "Белый" }.sumOf { it.calculateArea() }

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