package org.example.lesson6_3

fun main() {
    print("Введите кол-во секунд которые нужно засечь: ")
    var timeInSeconds = readln().toInt()

    while (--timeInSeconds > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: ${timeInSeconds}")
    }
    println("Время вышло!!!")
}