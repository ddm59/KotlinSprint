package org.example.lesson4_3
//Требуемые значения. неизменяемые константы
const val REQUIRED_WEATHER: String = "солнечная"
const val REQUIRED_TENT_POSSITION: String = "открыт"
const val REQUIRED_HUMIDITY: Int = 20
const val BAD_SEASON: String = "зима"

fun main() {
    // входные значения
    var currentHumidity = 20
    var currentSeason = "зима"
    var currentWeather = "солнечная"
    var currentTentPosition = "открыт"
    //блок с проверками
    var weatherCheck = REQUIRED_WEATHER == currentWeather
    var tentCheck = REQUIRED_TENT_POSSITION == currentTentPosition
    var conditionCheck = weatherCheck && tentCheck && (currentHumidity == REQUIRED_HUMIDITY) && (currentSeason != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых?: $conditionCheck")


}