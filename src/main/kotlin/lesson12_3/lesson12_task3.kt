package org.example.lesson12_3

const val KELVIN_CONSTANT: Float = 273.15f

fun main() {
    val temp = TempDaily(25, 15, true)
    temp.getWeatherInfo()
}

class TempDaily(_dayTemperature: Int, _nightTemperature: Int, _precipitationExpected: Boolean) {
    val dayTemperature = _dayTemperature
    val nightTemperature = _nightTemperature
    val precipitationExpected = _precipitationExpected

    fun getWeatherInfo() {
        println(
            """
               Дневная температура  в Кельвинах:  $dayTemperature 
               Ночная температура в Кельвинах:    $nightTemperature
               Наличие осадков в:                 $precipitationExpected
               
            """.trimIndent()
        )
    }
}