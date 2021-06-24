package me.ronaldbarros.collections

fun main(){
    val dwight = Employee("Dwight", 3500.0, "Senior")
    val jim = Employee("Jim", 3250.0, "Junior")
    val angela = Employee("Angela", 3350.0, "Senior")

    val employees1 = setOf(dwight, jim)
    val employees2 = setOf(angela)

    val resultUnion = employees1.union(employees2)
    resultUnion.forEach { println(it) }

    println("------")

    val employees3 = setOf(dwight, jim, angela)
    val resultIntersect = employees3.intersect(employees2)
    resultIntersect.forEach { println(it) }

    println("------")

    val resultSubtract = employees3.subtract(employees2)
    resultSubtract.forEach { println(it) }
}