package org.example.lesson17_4

class Package(private val packageNumber: String) {
    private var movementCounter: Int = 0
        private set

    var currentLocation: String = "Неизвестна"
        set(value) {
            field = value
            movementCounter++
        }

    fun displayInfo() {
        println("Номер посылки: $packageNumber")
        println("Текущая локация: $currentLocation")
        println("Счетчик передвижений: $movementCounter")
    }
}

fun main() {

    val package1 = Package("12345")

    package1.displayInfo()

    package1.currentLocation = "Процессинговый центр A"
    package1.displayInfo()

    package1.currentLocation = "Процессинговый центр B"
    package1.displayInfo()

    package1.currentLocation = "Центр доставки"
    package1.displayInfo()
}