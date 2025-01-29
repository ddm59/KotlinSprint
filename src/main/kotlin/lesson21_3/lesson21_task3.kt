package org.example.lesson21_3

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}

fun main() {

    val player1 = Player(name = "Герой", currentHealth = 100, maxHealth = 100)
    val player2 = Player(name = "Раненый", currentHealth = 50, maxHealth = 100)

    println("${player1.name} здоров: ${player1.isHealthy()}")
    println("${player2.name} здоров: ${player2.isHealthy()}")
}