package org.example.lesson14_4

fun main() {
    val planet = Planet("Марс", hasAtmosphere = true, suitableForLanding = true)
    planet.addMoon(Satellite("Фобос", hasAtmosphere = false, suitableForLanding = false))
    planet.addMoon(Satellite("Деймос", hasAtmosphere = false, suitableForLanding = false))

    println("Имя планеты:\n${planet.name}")
    planet.printMoonNames()
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
) : CelestialBody(name, hasAtmosphere, suitableForLanding)

class Planet(
    name: String,
    hasAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
) : CelestialBody(name, hasAtmosphere, suitableForLanding) {

    private val satellites: MutableList<Satellite> = mutableListOf<Satellite>()

    fun addMoon(satellite: Satellite) {
        satellites.add(satellite)
    }

    fun printMoonNames() {
        if (satellites.size > 0) {
            println("Спутники: ")
            satellites.forEach { satellite -> println(satellite.name) }
        } else {
            println("Спутников нет")
        }
    }
}

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean = false,
    val suitableForLanding: Boolean = false,
)