package org.example.lesson12_3

const val KELVIN_CONSTANT: Float = 273.15f

fun main() {
    val temp = TempDaily(25, 15, true)
    temp.getWeatherInfo()
}

class TempDaily(dayTemperature: Int, nightTemperature: Int, precipitationExpected: Boolean) {
    val dayTemperature: Int
    val nightTemperature: Int
    val precipitationExpected: Boolean

    init {
        this.dayTemperature = (dayTemperature.toFloat() + KELVIN_CONSTANT).toInt()
        this.nightTemperature = (nightTemperature.toFloat() + KELVIN_CONSTANT).toInt()
        this.precipitationExpected = precipitationExpected
    }

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