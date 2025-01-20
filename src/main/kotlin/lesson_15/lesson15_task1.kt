package org.example.lesson_15


fun main() {
    val crucian = Crucian()
    val duck = Duck()
    val seagull = Seagull()
    crucian.swim()
    duck.walk()
    duck.swim()
    seagull.fly()
    seagull.walk()
    seagull.swim()
}

class Crucian : Waterfowl {
    override fun swim() {
        println("Плыть двигая плавниками и хвостом")
    }
}

class Duck : Terrestrial, Waterfowl {
    override fun swim() {
        println("Плыть на поверхности воды перебирая лапками")
    }

    override fun walk() {
        println("Идти по суше")
    }
}

class Seagull : Terrestrial, Flying, Waterfowl {
    override fun fly() {
        println("Лететь активно двигая крыльями")
    }

    override fun swim() {
        println("Плыть на поверхности воды перебирая лапками")
    }

    override fun walk() {
        println("Идти по суше")
    }
}

interface Waterfowl {
    fun swim() {
        println("Плыть")
    }
}

interface Flying {
    fun fly() {
        println("Лететь")
    }
}

interface Terrestrial {
    fun walk() {
        println("Ходить")
    }
}