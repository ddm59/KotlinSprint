package org.example.lesson4_5

fun main() {

    println("\nДиагностика корабля. Требуется ввести текущие данные: \n")
    print("Наличие повреждений на корабле?  (true\\false ) :   ")

    var shipDamage = readlnOrNull() ?: "true"
    print("Колличество экипажа на кобале. (кол-во человек) :   ")
    var shipCrew = readlnOrNull() ?: "0"
    print("Количесво провизии на корабле (кол-во шт.) :   ")
    var shipProvision = readlnOrNull() ?: "0"
    print("Наличие благоприятной погоды (true\\false ):   ")
    var weather = readlnOrNull() ?: "false"

    println(
        "Разрешение на отплытие :  ${
            (!shipDamage.toBoolean() && (shipCrew.toInt() >= 55 && shipCrew.toInt() <= 70) && (shipProvision.toInt() > 50) && weather.toBoolean())
                    || ((shipCrew.toInt() == 70) && (shipProvision.toInt() >= 50) && weather.toBoolean())
        }"
    )

}