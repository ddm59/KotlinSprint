package org.example.lesson2_2

fun main() {
    val numberOfEmployee: Int = 50
    val numberOfTrainee: Int = 30
    val employeeSalary: Int = 30000
    val traineeSalary: Int = 20000
    var employeeExpenses: Int = numberOfEmployee * employeeSalary
    var totalSalaryExpenses: Int = numberOfTrainee * traineeSalary + employeeExpenses
    var averageSalary: Int = totalSalaryExpenses / (numberOfEmployee + numberOfTrainee)

    println("Расходы на выплату зарплаты постоянных сотрудников: $employeeExpenses")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryExpenses")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")
}