package org.example.lesson_4

const val REQUIRED_CREW: Int = 70
const val MIN_REQUIRED_CREW: Int = 55
const val REQUIRED_PROVISION: Int = 50
const val REQUIRED_WEATHER: String = "good"
const val IS_SHIP_DAMAGED: String = "no"

fun main() {

    println("\nДиагностика корабля. Требуется ввести текущие данные: \n")
    print("Наличие повреждений на корабле?  (yes\\no ) :   ")
    var shipDamageCheck = readln() == IS_SHIP_DAMAGED
    print("Колличество экипажа на кобале. (кол-во человек) :   ")
    var shipCrew = readln().toInt()
    print("Количесво провизии на корабле (кол-во шт.) :   ")
    var shipProvision = readln().toInt()
    print("Наличие благоприятной погоды (good\\bad ):   ")
    var weatherCheck = readln() == REQUIRED_WEATHER

    var isReadyForSail =
        (shipDamageCheck&& (shipCrew>= MIN_REQUIRED_CREW && shipCrew<= REQUIRED_CREW) && (shipProvision> REQUIRED_PROVISION) && weatherCheck)
                || ((shipCrew== REQUIRED_CREW) && (shipProvision >= REQUIRED_PROVISION) && weatherCheck)

    println("Разрешение на отплытие :  $isReadyForSail")

}