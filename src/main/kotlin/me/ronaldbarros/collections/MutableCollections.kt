package me.ronaldbarros.collections

fun main() {
    val dwight = Employee("Dwight", 3500.0, "Senior")
    val jim = Employee("Jim", 3250.0, "Junior")
    val angela = Employee("Angela", 3350.0, "Senior")

    println("---LIST---")
    val employees = mutableListOf(dwight, angela)
    employees.forEach { println(it) }

    println("---ADD---")
    employees.add(jim)
    employees.forEach { println(it) }

    println("---REMOVE---")
    employees.remove(dwight)
    employees.forEach { println(it) }

    println("---SET---")
    val employeesSet = mutableSetOf(dwight)
    employeesSet.forEach { println(it) }

    println("---ADD ALL---")
    employeesSet.addAll(employees)

    employeesSet.forEach { println(it) }
}