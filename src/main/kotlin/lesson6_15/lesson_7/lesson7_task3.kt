package org.example.lesson_7

fun main() {

    print("Введите верхнюю границу диапазона: ")
    val upperLimit = readln().toInt()

    for (i in 2..upperLimit step 2) {
        println("Четное число из диапазона: $i")
    }
}