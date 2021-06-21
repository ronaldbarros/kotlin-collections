package me.ronaldbarros.collections

fun main() {
    val values = IntArray(5)
    values[0] = 7
    values[1] = 3
    values[2] = 1
    values[3] = 5
    values[4] = 9

    for(value in values){
        println(value)
    }
    println("------")

    values.forEach { value ->
        println(value)
    }
    println("------")

    for(index in values.indices){
        println(values[index])
    }
    println("------")

    values.sort()
    for(value in values){
        println(value)
    }
}