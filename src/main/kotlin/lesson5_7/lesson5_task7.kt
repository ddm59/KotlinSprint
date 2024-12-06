package org.example.lesson5_7

const val FORMULA_DIVISOR = 100

fun main() {

    println("Для расчета стоимости поездки введите следующие данные.")
    println("Введите расстояние поездки в (километрах): ")

    val tripDistance = readln().toFloat()

    println("Расход топлива на 100 км (в литрах): ")

    val fuelСonsumption = readln().toFloat()

    println("Текущая цена за литр топлива: ")

    var fuelPrice = readln().toFloat()

    var amountOfFuel = (tripDistance * fuelСonsumption) / FORMULA_DIVISOR
    var tripCost = amountOfFuel * fuelPrice

    println(
        String.format(
            "Кол-во топлива требуемое на поездку: %.2f л.\nИтоговая стоимость поездки: %.2f р.",
            amountOfFuel,
            tripCost
        ))
}