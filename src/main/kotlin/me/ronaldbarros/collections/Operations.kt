package me.ronaldbarros.collections

fun main() {
    val salaries = doubleArrayOf(1500.0, 2250.0, 3750.0)

    for (salary in salaries) {
        println(salary)
    }

    println("Higher salary = ${salaries.maxOrNull()}")
    println("Smaller salary = ${salaries.minOrNull()}")
    println("Average salary = ${salaries.average()}")

    println("------")
    val higherThan2000 = salaries.filter { it > 2000 }
    higherThan2000.forEach { println(it) }

    println("------")
    println(salaries.count { it in 2000.0..5000.0 })

    println("------")
    println(salaries.find { it == 2250.0 })
    println(salaries.find { it == 700.0 })
    println(salaries.any { it == 1500.0 })
    println(salaries.any { it == 500.0 })
}