package org.example.lesson6_15.lesson_12

const val KELVIN_CONSTANT1 = 273

fun main() {
    val temp = TempDaily1(298, 288, true)
    temp.getWeatherInfo()
}

class TempDaily1(_dayTemperature: Int, _nightTemperature: Int, _precipitationExpected: Boolean) {
    val dayTemperature = _dayTemperature - KELVIN_CONSTANT1
    val nightTemperature = _nightTemperature - KELVIN_CONSTANT1
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