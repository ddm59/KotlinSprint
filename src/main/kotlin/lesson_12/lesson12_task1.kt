package org.example.lesson_12


fun main() {
    val temp = DailyTemperature()
    val temp2 = DailyTemperature()

    temp.getWeatherInfo()
    temp2.getWeatherInfo()

    temp.dayTemperature = 25
    temp.nigthTemperature = 15
    temp2.dayTemperature = 35
    temp2.nigthTemperature = -1
    temp2.precipitationExpected = true

    temp.getWeatherInfo()
    temp2.getWeatherInfo()

}


class DailyTemperature() {
    var dayTemperature = 0
    var nigthTemperature = 0
    var precipitationExpected: Boolean = false

    fun getWeatherInfo() {
        println(
            """Дневная температура:  $dayTemperature 
               Ночная температура:   $nigthTemperature
               Наличие осадков:      $precipitationExpected
            """.trimIndent()
        )
    }
}