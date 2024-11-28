package org.example.lesson2_2
//Добавлены переменные под каждое значение
fun main() {
    val numberOfEmployee = 50
    val numberOfTrainee = 30
    val employeeSalary = 30000
    val traineeSalary = 20000
    var employeeExpenses: Int = numberOfEmployee * employeeSalary
    var totalSalaryExpenses: Int = numberOfTrainee * traineeSalary + employeeExpenses
    var averageSalary: Int = totalSalaryExpenses / (numberOfEmployee + numberOfTrainee)

    println("Расходы на выплату зарплаты постоянных сотрудников: $employeeExpenses")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryExpenses")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")
}