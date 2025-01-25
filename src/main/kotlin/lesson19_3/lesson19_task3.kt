package org.example.lesson19_3

class Spaceship {

    fun takeOff() {
        // TODO: Добавить реализацию логики взлета
        println("Корабль взлетает...")
    }

    fun land() {
        println("Корабль приземляется...")
        // TODO: Реализовать дополнительные проверки или процедуры.
    }

    fun shootAsteroid() {
        TODO("Требуется реализовать логику стрельбы по астероидам")
    }
}

fun main() {
    val spaceship = Spaceship()

    spaceship.takeOff()
    spaceship.land()
}
