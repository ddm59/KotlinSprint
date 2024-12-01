package org.example.lesson4_5

const val REQUIRED_CREW: Int = 70
const val MIN_REQUIRED_CREW: Int = 55
const val REQUIRED_PROVISION: Int = 50

fun main() {

    println("\nДиагностика корабля. Требуется ввести текущие данные: \n")
    print("Наличие повреждений на корабле?  (true\\false ) :   ")
    var shipDamage = readln().toBoolean()
    print("Колличество экипажа на кобале. (кол-во человек) :   ")
    var shipCrew = readln().toInt()
    print("Количесво провизии на корабле (кол-во шт.) :   ")
    var shipProvision = readln().toInt()
    print("Наличие благоприятной погоды (true\\false ):   ")
    var weather = readln().toBoolean()

    var isReadyForSail =
        (!shipDamage&& (shipCrew>= MIN_REQUIRED_CREW && shipCrew<= REQUIRED_CREW) && (shipProvision> REQUIRED_PROVISION) && weather)
                || ((shipCrew== REQUIRED_CREW) && (shipProvision >= REQUIRED_PROVISION) && weather)

    println("Разрешение на отплытие :  $isReadyForSail")

}