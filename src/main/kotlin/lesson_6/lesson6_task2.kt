package org.example.lesson_6

const val SECONDS_IN_MILLISECONDS = 1000

fun main() {
    println("Введите кол-во секунд которые нужно засечь")
    var timeInSeconds = readln().toLong()
    Thread.sleep(timeInSeconds * SECONDS_IN_MILLISECONDS)
    println("Прошло $timeInSeconds секунд")
}