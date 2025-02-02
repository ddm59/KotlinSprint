package org.example.lesson_19

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
