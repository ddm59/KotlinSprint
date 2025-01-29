package org.example.lesson20_3

class Player(val name: String, val hasKey: Boolean)

fun main() {

    val checkDoorStatus: (Player) -> String = { player: Player ->
        if (player.hasKey) "Игрок ${player.name} открыл дверь" else "Дверь заперта"
    }

    val playerWithKey = Player(name = "Алексей", hasKey = true)
    val playerWithoutKey = Player(name = "Мария", hasKey = false)

    println(checkDoorStatus(playerWithKey))
    println(checkDoorStatus(playerWithoutKey))
}