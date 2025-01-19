package org.example.lesson16_2


abstract class WeatherStationStats {
    abstract fun sendData(): String
}

class Temperature(private val temperature: Double) : WeatherStationStats() {
    override fun sendData(): String {
        return "Температура: $temperature°C"
    }
}

class PrecipitationAmount(private val precipitation: Double) : WeatherStationStats() {
    override fun sendData(): String {
        return "Осадки: $precipitation mm"
    }
}

interface Command {
    fun execute()
}

class WeatherServer {
    fun sendToServer(data: WeatherStationStats) {
        println("Отправка данных на сервер: ${data.sendData()}")
    }
}

class WeatherDataCommand(
    private val server: WeatherServer,
    private val data: WeatherStationStats
) : Command {
    override fun execute() {
        server.sendToServer(data)
    }
}

fun main() {
    val temperatureData = Temperature(25.3)
    val precipitationData = PrecipitationAmount(12.4)

    val server = WeatherServer()

    // Создание команд
    val tempCommand = WeatherDataCommand(server, temperatureData)
    val precipCommand = WeatherDataCommand(server, precipitationData)

    // Выполнение команд
    tempCommand.execute()
    precipCommand.execute()
}