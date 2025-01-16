package org.example.lesson_16


fun main() {

    val dice = Dice()
    dice.getDiceRoll()
}

class Dice() {
    private val diceValue = (1..6).random()

    fun getDiceRoll() {
        println("Число выпавшее на кубике: $diceValue")
    }
}