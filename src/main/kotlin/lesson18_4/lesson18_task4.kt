package org.example.lesson18_4

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(private val length: Double, private val width: Double, private val height: Double) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + width * height + height * length)
    }
}

class Cube(private val side: Double) : Box() {
    override fun surfaceArea(): Double {
        return 6 * (side * side)
    }
}

fun main() {

    val rectangularBox = RectangularBox(2.0, 3.0, 4.0)
    val cube = Cube(3.0)
    val boxes: List<Box> = listOf(rectangularBox, cube)

    boxes.forEach { box ->
        println("Площадь поверхности коробки: ${box.surfaceArea()}")
    }
}
