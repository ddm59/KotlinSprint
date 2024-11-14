package org.example.lesson2_3

fun main(){
    var departureTime: Int = (9*60+39)
    var travelTime: Int = 457
    var arrivalHour: Int = (departureTime+travelTime)/60
    var arrivalMinute: Int = (departureTime+travelTime)%60

    println("Время прибытя поезда: "+String.format("%02d:%02d", arrivalHour, arrivalMinute))
}