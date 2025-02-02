package org.example.lesson_20

fun main() {

    val userGreetings: (String) -> String = { userName: String -> "С наступающим Новым Годом, $userName!" }

    println(userGreetings("Андрей"))
}