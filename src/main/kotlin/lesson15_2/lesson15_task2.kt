package org.example.lesson16_2

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class Temperature(private val temperature: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура: $temperature°C"
    }
}

class PrecipitationAmount(private val precipitation: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Осадки: $precipitation mm"
    }
}

class WeatherServer {
    fun sendToServer(data: WeatherStationStats) {
        println("Отправка данных на сервер: ${data.getData()}")
    }
}

fun main() {
    val temperatureData = Temperature(25.3)
    val precipitationData = PrecipitationAmount(12.4)

    val server = WeatherServer()

    server.sendToServer(temperatureData)
    server.sendToServer(precipitationData)
}