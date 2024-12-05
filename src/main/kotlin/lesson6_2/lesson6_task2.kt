package org.example.lesson6_2

import kotlin.concurrent.thread
const val SECONDS_IN_MILLISECONDS = 1000

fun main() {
    println("Введите кол-во секунд которые нужно засечь")
    var timeInSeconds = readln().toLong()
    Thread.sleep(timeInSeconds * SECONDS_IN_MILLISECONDS)
    println("Прошло $timeInSeconds секунд")
}