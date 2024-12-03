package org.example.lesson6_2

import kotlin.concurrent.thread

fun main() {
    println("Введите кол-во секунд которые нужно засечь")
    var timeInSeconds = readln().toInt()
    var timer = 0

    while (timer != timeInSeconds) {
        Thread.sleep(1000)
        timer++
    }
    println("Прошло $timeInSeconds секунд")
}