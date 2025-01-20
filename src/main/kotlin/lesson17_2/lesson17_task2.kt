package org.example.lesson17_2

class Ship(name: String, var averageSpeed: Double, var homePort: String) {

    private var _name: String = name

    var name: String
        get() = _name
        set(value) {
            println("Предупреждение: Имя корабля нельзя изменить.")
        }

    override fun toString(): String {
        return "Корабль(имя:  '$name', средняя скорость:  $averageSpeed, порт приписки:  '$homePort')"
    }
}

fun main() {

    val ship = Ship("Black Pearl", 25.0, "Port Royal")

    println(ship)

    ship.name = "Flying Dutchman"

    ship.averageSpeed = 30.0
    ship.homePort = "Tortuga"

    println(ship)
}
