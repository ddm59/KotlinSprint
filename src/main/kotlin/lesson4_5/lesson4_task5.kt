package org.example.lesson4_5

fun main() {

    println("\nДиагностика корабля. Требуется ввести текущие данные: \n")
    //Не до конца понял как правильно осуществить провверку на ввод значений оперируя текущими вводными данными
    // так как по идее мы еще не прошли условные операторы сделал через ?:  чтоб хотя бы избежать ввода пустых значений
    // в идеале нужно проверять ввод на корректный ввод
    // возможно не верно понял ТЗ.
    print("Наличие повреждений на корабле?  (true\\false ) :   ")
    var shipDamage = readlnOrNull() ?: "true"
    print("Колличество экипажа на кобале. (кол-во человек) :   ")
    var shipCrew = readlnOrNull() ?: "0"
    print("Количесво провизии на корабле (кол-во шт.) :   ")
    var shipProvision = readlnOrNull() ?: "0"
    print("Наличие благоприятной погоды (true\\false ):   ")
    var weather = readlnOrNull() ?: "false"

    var isReadyForSail =
        (!shipDamage.toBoolean() && (shipCrew.toInt() >= 55 && shipCrew.toInt() <= 70) && (shipProvision.toInt() > 50) && weather.toBoolean())
                || ((shipCrew.toInt() == 70) && (shipProvision.toInt() >= 50) && weather.toBoolean())

    println("Разрешение на отплытие :  $isReadyForSail")

}