package org.example.lesson_14

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()

    liner.shipInfo()
    cargo.shipInfo()
    icebreaker.shipInfo()
}

class Icebreaker(
    val isBreakingIce: Boolean = true,
) : Liner(
    name = "Ледокол",
    speed = 100,
    capacity = 500,
) {
    override fun shipInfo() {
        println("Модель корабля: $name\nСкорость: $speed км/ч, Грузоподъемность: $capacity тонн, Раскалывание льда: $isBreakingIce")
    }
}

class Cargo() : Liner(
    name = "Грузовой корабль",
    speed = 100,
    capacity = 100000,
) {}

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 250,
    val capacity: Int = 1000,
) {
    open fun shipInfo() {
        println("Модель корабля: $name\nСкорость: $speed км/ч, Грузоподъемность: $capacity тонн")
    }
}