package org.example.lesson12_2

fun main() {
    val temp = DailyTemp(35, -1, true)
    temp.getWeatherInfo()
}

class DailyTemp(val dayTemperature: Int, val nightTemperature: Int, val precipitationExpected: Boolean) {

    fun getWeatherInfo() {
        println(
            """
               Дневная температура:  $dayTemperature 
               Ночная температура:   $nightTemperature
               Наличие осадков:      $precipitationExpected
               
            """.trimIndent()
        )
    }
}