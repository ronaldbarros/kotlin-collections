package me.ronaldbarros.collections

fun main() {
    val salaries = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println("Sum: ${salaries.sum()}")
    println("Average: ${salaries.avg()}")
}