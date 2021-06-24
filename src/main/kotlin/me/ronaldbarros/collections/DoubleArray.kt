package me.ronaldbarros.collections

fun main() {
    val salaries = DoubleArray(3)
    salaries[0] = 1000.0
    salaries[1] = 2000.0
    salaries[2] = 5000.0

    salaries.forEachIndexed { index, salary ->
        salaries[index] = salary * 1.1
    }

    salaries.forEach {
        println(it)
    }

    println("------")

    val salaries2 = doubleArrayOf(1500.0, 1250.0, 3750.0)
    salaries2.sort()
    salaries2.forEach {
        println(it)
    }
}