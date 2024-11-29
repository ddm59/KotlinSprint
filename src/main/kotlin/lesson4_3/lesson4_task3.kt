package org.example.lesson4_3

const val REQUIRED_WEATER: String = "солнечная"
const val REQUIRED_TENT_POSSITION: String = "открыт"
const val REQUIRED_HUMIDITY: Int = 20
const val BAD_SEASON: String = "зима"

fun main() {

    var weatherCheck = REQUIRED_WEATER == "солнечная"
    var tentCheck = REQUIRED_TENT_POSSITION == "открыт"
    var currentHumidity = 20
    var currentSeason = "зима"

    print("Благоприятные ли условия сейчас для роста бобовых? ")
    println(weatherCheck && tentCheck && (currentHumidity == REQUIRED_HUMIDITY) && (currentSeason != BAD_SEASON))
}