package org.example.lesson12_3

const val KELVIN_CONSTANT = 273

fun main() {
    val temp = TempDaily(298, 288, true)
    temp.getWeatherInfo()
}

class TempDaily(_dayTemperature: Int, _nightTemperature: Int, _precipitationExpected: Boolean) {
    val dayTemperature = _dayTemperature - KELVIN_CONSTANT
    val nightTemperature = _nightTemperature - KELVIN_CONSTANT
    val precipitationExpected = _precipitationExpected

    fun getWeatherInfo() {
        println(
            """
               Дневная температура  в Цельсиях:  $dayTemperature 
               Ночная температура в Цельсиях:    $nightTemperature
               Наличие осадков:                  $precipitationExpected
               
            """.trimIndent()
        )
    }
}