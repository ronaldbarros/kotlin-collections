package me.ronaldbarros.collections

fun main() {
    val names = Array(3) { "" }
    names[0] = "Mary"
    names[1] = "Theo"
    names[2] = "John"

    for (name in names){
        println(name)
    }

    println("------")

    names.sort()
    names.forEach {
        println(it)
    }

    val names2 = arrayOf("Mike", "William", "Jackie")
    println("------")
    names2.sort()
    names2.forEach {
        println(it)
    }
}