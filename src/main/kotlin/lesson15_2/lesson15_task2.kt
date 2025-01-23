package org.example.lesson16_2


abstract class WeatherStationStats {
    abstract val data: Double
}

class Temperature(val temperature: Double) : WeatherStationStats() {
    override val data: Double = temperature
}

class PrecipitationAmount(private val precipitation: Double) : WeatherStationStats() {
    override val data: Double = precipitation
}

class WeatherServer {
    fun sendToServer(dataToSend: WeatherStationStats) {
        when (dataToSend) {
            is Temperature -> println("Отправка данных на сервер: Температура: ${dataToSend.data}°C")
            is PrecipitationAmount -> println("Отправка данных на сервер: Осадки: ${dataToSend.data} mm")
            else -> println("Ошибка отправки!!! Данных нет либо данные не корректны")
        }
    }
}

fun main() {
    val temperatureData = Temperature(25.3)
    val precipitationData = PrecipitationAmount(12.4)

    val server = WeatherServer()
    server.sendToServer(temperatureData)
    server.sendToServer(precipitationData)
}