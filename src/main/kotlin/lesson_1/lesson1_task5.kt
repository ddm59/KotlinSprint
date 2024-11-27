package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600
fun main() {

    var timeInSpaceInSeconds = 6480
    val secondsInSpace: Int = timeInSpaceInSeconds % SECONDS_IN_MINUTE
    val minutesInSpace: Int = (timeInSpaceInSeconds / SECONDS_IN_MINUTE) % SECONDS_IN_MINUTE
    val hoursInSpace: Int = timeInSpaceInSeconds / SECONDS_IN_HOUR


    println(
        String.format(
            "Время проведенное в космосе: %02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace
        )
    )

}