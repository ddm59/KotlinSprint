package org.example.lesson_10

fun main() {
    val humanThrow = diceThrowAct()
    val computerThrow = diceThrowAct()

    println("Бросок человека: $humanThrow")
    println("Бросок компьютера: $computerThrow")

    if (humanThrow > computerThrow) {
        println("Победило человечество!!!")
    } else if (computerThrow > humanThrow) {
        println("Победила машина!!!")
    } else {
        println("Победила дружба!!!")
    }
}

fun diceThrowAct(): Int = (1..6).random()
