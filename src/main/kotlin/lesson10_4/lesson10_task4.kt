package org.example.lesson10_4

fun main() {
    var gameStats = arrayOf(0, 0, 0, 0)
    var isGameEnd = false

    do {
        gameStats = diceGame(gameStats)
        println("Хотите бросить кости еще раз? (да/нет)")
        if (readln().lowercase() == "да") {
            isGameEnd = false
        } else{
            isGameEnd = true
        }
    } while (!isGameEnd)
    println(
        """
        Игра окончена!!!
        --------------------------------------
        Сыграно:              ${gameStats[0]}  
        Выиграно человеком:   ${gameStats[1]}  
        Выиграно компьютером: ${gameStats[2]}  
        Сыграно в ничью:      ${gameStats[3]}  
        -------------------------------------
    """.trimIndent()
    )
}

fun diceThrow(): Int = (1..6).random()

fun diceGame(gameStats: Array<Int>): Array<Int> {

    val humanThrow = diceThrow()
    println("Бросок человека: $humanThrow")
    val computerThrow = diceThrow()
    println("Бросок компьютера: $computerThrow")

    if (humanThrow > computerThrow) {
        println("Человечество победило!!!")
        gameStats[1]++

    } else if (humanThrow < computerThrow) {
        println("Победила машина!!!")
        gameStats[2]++

    } else {
        println("Ничья")
        gameStats[3]++
    }

    gameStats[0]++
    return gameStats
}