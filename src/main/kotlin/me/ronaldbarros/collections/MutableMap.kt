package me.ronaldbarros.collections

fun main() {
    val dwight = Employee("Dwight", 3500.0, "Senior")
    val jim = Employee("Jim", 3250.0, "Junior")
    val angela = Employee("Angela", 3350.0, "Senior")

    val repository = Repository<Employee>()

    repository.create(dwight.name, dwight)
    repository.create(jim.name, jim)
    repository.create(angela.name, angela)

    println(repository.findById(dwight.name))

    println("------")
    repository.findAll().forEach { println(it) }

    println("------")
    repository.remove(angela.name)
    repository.findAll().forEach { println(it) }
}