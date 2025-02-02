package org.example.lesson_16

class Player(val name: String, initialHealth: Int, var attackPower: Int) {

    var health: Int = initialHealth
        private set

    private var isAlive: Boolean = true

    fun takeDamage(damage: Int) {
        if (!isAlive) {
            println("$name уже мёртв и не может получить урон.")
            return
        }

        health -= damage
        println("$name получает $damage урона. Здоровье: $health")

        if (health <= 0) {
            die()
        }
    }

    fun heal(amount: Int) {
        if (!isAlive) {
            println("$name мёртв и не может быть вылечен.")
            return
        }

        health += amount
        println("$name вылечивается на $amount. Здоровье: $health")
    }

    private fun die() {
        isAlive = false
        health = 0
        attackPower = 0
        println("$name умер. Сила удара и здоровье обнулены.")
    }
}

fun main() {
    val player = Player("Герой", 100, 20)

    println("Начальные характеристики: имя: ${player.name}, здоровье: ${player.health}, сила удара: ${player.attackPower}")

    player.takeDamage(30) // Урон 30
    player.heal(20)       // Лечение 20
    player.takeDamage(50) // Урон 50
    player.takeDamage(50) // Урон 50 (должен убить)
    player.heal(10)       // Попытка лечения после смерти
}
