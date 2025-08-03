package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val salaryEmployees = 30000
    val numberOfTrainees = 30
    val salaryTrainees = 20000

    val paymentEmployees = numberOfEmployees * salaryEmployees
    val paymentTrainees = numberOfTrainees * salaryTrainees
    val paymentTotal = paymentEmployees + paymentTrainees
    val averageSalary =  paymentTotal / (numberOfEmployees + numberOfTrainees)
    println("Выплата ЗП сотрудникам: $paymentEmployees")
    println("Общие расходы: $paymentTotal")
    println("Средняя ЗП сотрудника: $averageSalary")





}