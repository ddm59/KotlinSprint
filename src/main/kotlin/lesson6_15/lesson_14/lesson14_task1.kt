package org.example.lesson_14

fun main() {
    val liner = Liner1()
    val cargo = Cargo1()
    val icebreaker = Icebreaker1()

    liner.getInfo()
    cargo.getInfo()
    icebreaker.getInfo()
}

class Icebreaker1(
    val isBreakingIce: Boolean = true,
) : Liner(
    name = "Ледокол",
    speed = 100,
    capacity = 500,
) {
    override fun getInfo() {
        println("Модель корабля: $name\nСкорость: $speed км/ч, Грузоподъемность: $capacity тонн, Раскалывание льда: $isBreakingIce")
    }
}

class Cargo1() : Liner(
    name = "Грузовой корабль",
    speed = 100,
    capacity = 100000,
)

open class Liner1(
    val name: String = "Лайнер",
    val speed: Int = 250,
    val capacity: Int = 1000,
) {
    open fun getInfo() {
        println("Модель корабля: $name\nСкорость: $speed км/ч, Грузоподъемность: $capacity тонн")
    }
}