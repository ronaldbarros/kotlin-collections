package me.ronaldbarros.collections

data class Employee(
    val name: String,
    val salary: Double,
    val category: String
) {
    override fun toString(): String =
        """
            Name: $name
            Salary: $salary
        """.trimIndent()
}