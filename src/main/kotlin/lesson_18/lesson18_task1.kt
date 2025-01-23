package org.example.lesson_18

class Order(val orderNumber: String) {

    fun printOrderInfo(item: String) {
        println("Заказ №$orderNumber.\nЗаказан товар: $item\n")
    }

    fun printOrderInfo(items: List<String>) {
        val itemsList = items.joinToString(separator = ", ")
        println("Заказ №$orderNumber.\nЗаказаны следующие товары: $itemsList\n")
    }
}

fun main() {
    val singleItemOrder = Order("1001")
    singleItemOrder.printOrderInfo("Ноутбук")

    val multipleItemsOrder = Order("1002")
    multipleItemsOrder.printOrderInfo(listOf("Чехол", "Мышка", "Коврик"))
}