package org.example.lesson6_15.lesson_12

const val KELVIN_CONSTANT: Float = 273.15f

fun main() {
    val temp = TempDaily(25, 15, true)
}

class TempDaily(var dayTemperature: Int, var nightTemperature: Int, var precipitationExpected: Boolean) {

    init {
        this.dayTemperature = (dayTemperature.toFloat() + KELVIN_CONSTANT).toInt()
        this.nightTemperature = (nightTemperature.toFloat() + KELVIN_CONSTANT).toInt()
        println(
            """
               Дневная температура  в Кельвинах:  $dayTemperature 
               Ночная температура в Кельвинах:    $nightTemperature
               Наличие осадков в:                 $precipitationExpected
               
            """.trimIndent()
        )
    }
}