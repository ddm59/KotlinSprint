package org.example.lesson19_2

enum class Category(private val userFriendlyName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISC("Разное");

    fun getUserFriendlyName(): String {
        return userFriendlyName
    }
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category
) {

    fun printInfo() {
        println("Название: $name")
        println("ID: $id")
        println("Категория: ${category.getUserFriendlyName()}")
        println("-----------------")
    }
}

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHING)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Термокружка", 3, Category.MISC)

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}