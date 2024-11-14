package org.example.lesson_1

fun main() {

    val timeInSpaceInSeconds: Int = 6480
    val secondsInSpace: Int = timeInSpaceInSeconds % 60
    val minutesInSpace: Int = (timeInSpaceInSeconds / 60) % 60
    val hoursInSpace: Int = timeInSpaceInSeconds / 3600


    println(String.format(
            "Время проведенное в космосе: %02d:%02d:%02d", hoursInSpace,  minutesInSpace, secondsInSpace))

}