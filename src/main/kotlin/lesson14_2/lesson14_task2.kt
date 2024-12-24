package org.example.lesson14_2


fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()

    liner.getInfo()
    liner.startCargoLoading()
    cargo.getInfo()
    cargo.startCargoLoading()
    icebreaker.getInfo()
    icebreaker.startCargoLoading()
}

class Icebreaker(
    val isBreakingIce: Boolean = true,
) : Liner(
    name = "Ледокол",
    speed = 100,
    capacity = 500,
) {
    override fun getInfo() {
        println("Модель корабля: $name\nСкорость: $speed км/ч, Грузоподъемность: $capacity тонн, Раскалывание льда: $isBreakingIce")
    }

    override fun startCargoLoading() {
        println("Начало погрузки")
        println("Открытие ворот со стороны кормы")
    }
}

class Cargo() : Liner(
    name = "Грузовой корабль",
    speed = 100,
    capacity = 100000,
) {
    override fun startCargoLoading() {
        println("Начало погрузки")
        println("Активация погрузочного крана")
    }
}

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 250,
    val capacity: Int = 1000,
) {
    open fun getInfo() {
        println("Модель корабля: $name\nСкорость: $speed км/ч, Грузоподъемность: $capacity тонн")
    }

    open fun startCargoLoading() {
        println("Начало погрузки")
        println("Выдвижение горизонтального трапа со шкафута")
    }
}