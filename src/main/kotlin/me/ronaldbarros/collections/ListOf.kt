package me.ronaldbarros.collections

fun main() {
    val dwight = Employee("Dwight", 3500.0, "Senior")
    val jim = Employee("Jim", 3250.0, "Junior")
    val angela = Employee("Angela", 3350.0, "Senior")

    val employees = listOf(dwight, jim, angela)

    employees.forEach { println(it) }

    println("------")
    // find by name
    println(employees.find { it.name == "Angela" })

    println("------")
    // sort by salary
    employees.sortedBy { it.salary }.forEach { println(it) }

    println("------")
    // group by category
    employees.groupBy { it.category }.forEach { println(it) }
}
