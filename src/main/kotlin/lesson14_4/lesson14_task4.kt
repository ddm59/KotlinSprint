package org.example.lesson14_4

fun main() {
    val planet = Planet("Марс", hasAtmosphere = true, suitableForLanding = true)
    planet.addMoon(CelestialBody("Фобос", hasAtmosphere = false, suitableForLanding = false))
    planet.addMoon(CelestialBody("Деймос", hasAtmosphere = false, suitableForLanding = false))

    println("Имя планеты:\n${planet.name}")
    planet.printMoonNames()
}

class Planet(
    name: String,
    hasAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
) : CelestialBody(name, hasAtmosphere, suitableForLanding) {

    private val moons: MutableList<CelestialBody> = mutableListOf<CelestialBody>()

    fun addMoon(moon: CelestialBody) {
        moons.add(moon)
    }

    fun printMoonNames() {
        if (moons.size > 0) {
            println("Спутники: ")
            moons.forEach { moon -> println(moon.name) }
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