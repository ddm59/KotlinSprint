package org.example.lesson12_5

import kotlin.random.Random


fun main() {
    val weatherList = List(30) {
        WeatherData(
            dayTemp = Random.nextDouble(-15.0, 35.0),
            nightTemp = Random.nextDouble(-15.0, 35.0),
            hasPrecipitation = Random.nextBoolean(),
        )
    }

    val dayTemperatures = weatherList.map { it.dayTemp }
    val nightTemperatures = weatherList.map { it.nightTemp }
    val precipitationDays = weatherList.count { it.hasPrecipitation }

    val averageDayTemp = dayTemperatures.average()
    val averageNightTemp = nightTemperatures.average()

    println("Средняя дневная температура за месяц: ${"%.2f".format(averageDayTemp)} \u00B0C")
    println("Средняя ночная температура за месяц: ${"%.2f".format(averageNightTemp)} \u00B0C")
    println("Количество дней с осадками: $precipitationDays из 30")
}


data class WeatherData(
    val dayTemp: Double,
    val nightTemp: Double,
    val hasPrecipitation: Boolean,
)