package org.example.lesson2_3

const val MINUTES_IN_HOUR: Int = 60

fun main(){
    var startHour: Int = 9
    var startMinute: Int = 39
    var travelTimeInMinutes: Int = 457
    var departureTime: Int = (startHour* MINUTES_IN_HOUR+startMinute)
    var arrivalHour: Int = (departureTime+travelTimeInMinutes)/MINUTES_IN_HOUR
    var arrivalMinute: Int = (departureTime+travelTimeInMinutes)%MINUTES_IN_HOUR

    println("Время прибытия поезда: "+String.format("%02d:%02d", arrivalHour, arrivalMinute))
}
