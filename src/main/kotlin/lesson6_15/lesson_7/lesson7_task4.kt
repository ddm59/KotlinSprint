package org.example.lesson_7

fun main() {
    print("Введите кол-во засекаемых секунд: ")
    var userTime = readln().toInt()

    for (i in userTime downTo 1) {
        Thread.sleep(1000)
        if (i == 1) break
        println("Осталось: ${i - 1} секунд")
    }
    println("Время вышло!!!")
}