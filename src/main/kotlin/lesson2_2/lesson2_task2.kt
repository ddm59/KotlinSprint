package org.example.lesson2_2

fun main(){
    var regularEmployeesSalary: Int = 50*30000
    var totalSalary: Int = 30*20000+regularEmployeesSalary
    var averageSalary: Int = totalSalary/80

    println("Расходы на выплату зарплаты постоянных сотрудников: $regularEmployeesSalary")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")
}