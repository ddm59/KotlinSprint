package org.example.lesson_3

fun main() {
    var nameData = "Дмитрий"
    var timeData = "день"
    println(userGreetings(nameData, timeData))
    nameData = "Олег"
    timeData = "вечер"
    println(userGreetings(nameData, timeData))
}

fun userGreetings(userName: String, timeOfaDay: String): String {
    return "Добрый $timeOfaDay $userName , чем мы можем вам помочь?"
}
