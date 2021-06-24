package me.ronaldbarros.collections

fun main(){
    val pair: Pair<String, Double> = Pair("Stanley", 3000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Key: $k, Value: $v") }

    val map2 = mapOf(
        "Kevin" to 3100.0,
        "Pam" to 2500.0
    )

    map2.forEach { (k, v) -> println("Key: $k, Value: $v") }
}