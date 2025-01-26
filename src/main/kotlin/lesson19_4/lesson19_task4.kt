package org.example.lesson19_4

enum class Ammo(val damage: Int) {
    ARMOR_PIERCING(5),
    HIGH_EXPLOSIVE_ANTI_TANK(10),
    HIGH_EXPLOSIVE_SQUASH_HEAD(20)
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun loadAmmo(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк заряжен патронами: ${ammo.name}, урон: ${ammo.damage}")
    }

    fun shoot() {
        if (currentAmmo != null) {
            println("Выстрел произведен! Нанесенный урон: ${currentAmmo!!.damage}")
        } else {
            println("Танк не заряжен! Выстрел невозможен.")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.loadAmmo(Ammo.ARMOR_PIERCING)
    tank.shoot()

    tank.loadAmmo(Ammo.HIGH_EXPLOSIVE_ANTI_TANK)
    tank.shoot()

    tank.loadAmmo(Ammo.HIGH_EXPLOSIVE_SQUASH_HEAD)
    tank.shoot()
}