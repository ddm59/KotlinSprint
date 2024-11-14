package org.example.lesson_1

fun main() {

    val secondsInSpace: Int = 6480

    println(
        "Время проведенное в космосе: " + String.format(
            "%02d:%02d:%02d", secondsInSpace / 3600, (secondsInSpace % 3600) / 60, secondsInSpace % 60
        )
    )
}