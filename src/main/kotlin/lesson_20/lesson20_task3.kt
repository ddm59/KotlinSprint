package org.example.lesson_20

class Player1(val name: String, val hasKey: Boolean)

fun main() {

    val checkDoorStatus: (Player1) -> String = { player: Player1 ->
        if (player.hasKey) "Игрок ${player.name} открыл дверь" else "Дверь заперта"
    }

    val playerWithKey = Player1(name = "Алексей", hasKey = true)
    val playerWithoutKey = Player1(name = "Мария", hasKey = false)

    println(checkDoorStatus(playerWithKey))
    println(checkDoorStatus(playerWithoutKey))
}