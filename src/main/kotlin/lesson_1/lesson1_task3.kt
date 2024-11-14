package org.example.lesson_1

import jdk.internal.misc.Signal

fun main(){
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("Первый полет человека в Космос.")
    println("Год полета - $year")
    println("Взлет - "+String.format("%02d:%02d",hour,minute))

    hour = 10
    minute = 55

    println("Посадка - "+String.format("%02d:%02d",hour,minute))

}