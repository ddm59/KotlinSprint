package org.example.lesson_1

fun main(args: Array<String>) {
    var numberOfOrders: Int = 0
    val sellAppreciate: String = "Отличный выбор. Благодарим за покупку!!!"

    //Обьявление новой переменой numberOfEmployees, тип Int. Хранит  кол-во сотрудников
    var numberOfEmployees: Int = 2000

    println("Проинициализированны пременные:\n-- numberOfOrders\n-- sellAppreciate ")

    //Вывод в консоль кол-ва сотрудников
    //println("Колличество сотрудников на данный момент: $numberOfEmployees")

    //Изменение значения переменной
    numberOfEmployees = 1999

    //Вывод нового значения в консоль
    println("Колличество сотрудников на данный момент: $numberOfEmployees")
}