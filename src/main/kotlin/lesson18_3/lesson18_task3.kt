package org.example.lesson18_3

abstract class Pet(val name: String) {
    abstract fun eat()
}

class Fox(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Pet(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {

    val fox = Fox("Фенек")
    val dog = Dog("Бобик")
    val cat = Cat("Мурка")

    val pets: List<Pet> = listOf(fox, dog, cat)
    pets.forEach { it.eat() }
}