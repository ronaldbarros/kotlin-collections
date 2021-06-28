package me.ronaldbarros.collections

import java.math.BigDecimal

fun Array<BigDecimal>.sum() = this.reduce { acc, value ->
    acc + value
}

fun Array<BigDecimal>.avg() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.sum() / this.size.toBigDecimal()