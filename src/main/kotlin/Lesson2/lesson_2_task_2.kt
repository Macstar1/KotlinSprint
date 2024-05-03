package org.example.Lesson2

fun main() {
    val employees = 50
    val trainees = 30
    val employeeSalary = 30_000
    val traineeSalary = 20_000

    val totalEmployeeSalary = employees * employeeSalary
    val totalTraineeSalary = traineeSalary * trainees
    val totalSalary = totalTraineeSalary + totalEmployeeSalary
    val averageSalary =
        (totalEmployeeSalary + totalTraineeSalary) / (employees + trainees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $totalEmployeeSalary")
    println("Общие расходы по ЗП: $totalSalary")
    println("Средняя ЗП одного сотрудника: $averageSalary")

}