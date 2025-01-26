package org.example.lesson20_2

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun main() {

    val healPotion: (Player) -> Unit = { player: Player ->
        player.currentHealth = player.maxHealth
        println("${player.name} полностью вылечен! Текущее здоровье: ${player.currentHealth}")
    }

    val player = Player(name = "Герой", currentHealth = 50, maxHealth = 100)

    println("До применения зелья: ${player.name} — здоровье: ${player.currentHealth}/${player.maxHealth}")

    healPotion(player)

    println("После применения зелья: ${player.name} — здоровье: ${player.currentHealth}/${player.maxHealth}")
}