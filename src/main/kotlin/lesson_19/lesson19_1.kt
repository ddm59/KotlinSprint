package org.example.lesson_19

enum class FishType(val displayName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Cкалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

    companion object {
        fun printAvailableFish() {
            println("Вы можете добавить следующих рыбок в свой аквариум:")
            FishType.entries.forEach { fish ->
                println("- ${fish.displayName}")
            }
        }
    }
}

fun main() {
    FishType.printAvailableFish()
}
