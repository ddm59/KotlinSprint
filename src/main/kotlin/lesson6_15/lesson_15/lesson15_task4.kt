package org.example.lesson6_15.lesson_15

interface Searchable {
    fun searchAccessories()
}

open class Product(val name: String, var stock: Int) {
    override fun toString(): String {
        return "$name (На складе: $stock шт.)"
    }
}

class Instrument(name: String, stock: Int) : Product(name, stock), Searchable {
    private val accessories: MutableList<Accessory> = mutableListOf()

    fun addAccessory(accessory: Accessory) {
        accessories.add(accessory)
    }

    override fun searchAccessories() {
        println("Выполняется поиск комплектующих для $name...")
        if (accessories.isNotEmpty()) {
            println("Найдены комплектующие:")
            accessories.forEach { println("- ${it.name}") }
        } else {
            println("Комплектующие не найдены.")
        }
    }
}

class Accessory(name: String, stock: Int) : Product(name, stock)

fun main() {

    val guitar = Instrument("Гитара", 10)
    val strings = Accessory("Струны", 50)
    val tuner = Accessory("Тюнер", 30)

    guitar.addAccessory(strings)
    guitar.addAccessory(tuner)

    println(guitar)
    guitar.searchAccessories()

    println(strings)
    println(tuner)
}
