package org.example.lesson_18

class Screen {

    fun draw(x: Int, y: Int): String {
        return "Нарисована точка с координатами (Int): ($x, $y)"
    }

    fun draw(x: Float, y: Float): String {
        return "Нарисована точка с координатами (Float): ($x, $y)"
    }

    fun draw(x: Int, y: Int, radius: Int): String {
        return "Нарисован круг с центром в координатах (Int): ($x, $y) и радиусом $radius"
    }

    fun draw(x: Float, y: Float, radius: Float): String {
        return "Нарисован круг с центром в координатах (Float): ($x, $y) и радиусом $radius"
    }

    fun draw(x: Int, y: Int, side: Int, isSquare: Boolean): String {
        return "Нарисован квадрат с координатами верхнего левого угла (Int): ($x, $y) и стороной $side"
    }

    fun draw(x: Float, y: Float, side: Float, isSquare: Boolean): String {
        return "Нарисован квадрат с координатами верхнего левого угла (Float): ($x, $y) и стороной $side"
    }
}

fun main() {
    val screen = Screen()

    println(screen.draw(10, 20))
    println(screen.draw(10.5f, 20.5f))

    println(screen.draw(15, 25, 5))
    println(screen.draw(15.5f, 25.5f, 5.5f))

    println(screen.draw(5, 10, 20, true))
    println(screen.draw(5.5f, 10.5f, 20.5f, true))
}