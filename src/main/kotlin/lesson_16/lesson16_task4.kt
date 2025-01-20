package org.example.lesson_16

class Order(private val orderNumber: Int) {

    var status: String = "Создан"
        private set // Закрываем возможность прямого изменения статуса

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: String) {
        println("Отправка заявки менеджеру на изменение статуса заказа #$orderNumber...")
        managerApproveStatusChange(newStatus)
    }

    private fun managerApproveStatusChange(newStatus: String) {
        println("Менеджер одобрил изменение статуса для заказа #$orderNumber.")
        updateStatus(newStatus)
        println("Статус заказа #$orderNumber успешно изменён на '$status'.")
    }
}

fun main() {
    val order = Order(12345)
    println("Текущий статус заказа: ${order.status}")

    order.requestStatusChange("В обработке")
    println("Текущий статус заказа: ${order.status}")

    order.requestStatusChange("Доставлен")
    println("Текущий статус заказа: ${order.status}")
}
