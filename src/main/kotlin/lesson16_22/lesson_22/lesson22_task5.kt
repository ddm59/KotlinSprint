package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звездная система к Солнечной системе, состоящая из трех звезд: Alpha Centauri A, Alpha Centauri B и Proxima Centauri.",
        eventDateTime = LocalDateTime.now(),
        distanceFromEarth = 4.37
    )

    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата и время события: ${alphaCentauri.component3()}")
    println("Расстояние от Земли: ${alphaCentauri.component4()} световых лет")
}
