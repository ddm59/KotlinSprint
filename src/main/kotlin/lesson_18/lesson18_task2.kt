package org.example.lesson_18



abstract class Dice(val sides: Int) {
    abstract fun roll()
}

class FourSidedDice : Dice(4) {
    override fun roll() {
        val result = (1..sides).random()
        println("D4 выпала грань: $result")
    }
}

class SixSidedDice : Dice(6) {
    override fun roll() {
        val result = (1..sides).random()
        println("D6 выпала грань: $result")
    }
}

class EightSidedDice : Dice(8) {
    override fun roll() {
        val result = (1..sides).random()
        println("D8 выпала грань: $result")
    }
}

fun main() {

    val dice4 = FourSidedDice()
    val dice6 = SixSidedDice()
    val dice8 = EightSidedDice()

    val diceList: List<Dice> = listOf(dice4, dice6, dice8)
    diceList.forEach{it.roll()}
}