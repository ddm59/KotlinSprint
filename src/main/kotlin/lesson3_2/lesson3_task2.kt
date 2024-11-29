package org.example.lesson3_2

fun main() {
    var personSurname = "Андреева"
    val personFirstName = "Татьяна"
    val personPatronymic = "Сергеевна"
    var personAge = 20

    println("$personSurname $personFirstName $personPatronymic, $personAge")

    personAge = 22
    personSurname = "Сидорова"

    println("$personSurname $personFirstName $personPatronymic, $personAge")
}