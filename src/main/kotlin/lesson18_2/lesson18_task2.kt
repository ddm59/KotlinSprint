package org.example.lesson18_2

import kotlin.random.Random

abstract class Dice(val sides: Int) {
    abstract fun roll()
}

class D4 : Dice(4) {
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("D4 выпала грань: $result")
    }
}

class D6 : Dice(6) {
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("D6 выпала грань: $result")
    }
}

class D8 : Dice(8) {
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("D8 выпала грань: $result")
    }
}

fun main() {

    val dice4 = D4()
    val dice6 = D6()
    val dice8 = D8()

    val diceList: List<Dice> = listOf(dice4, dice6, dice8)
    diceList.forEach{it.roll()}
}