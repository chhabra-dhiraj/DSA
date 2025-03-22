package io.github.chhabra_dhiraj.daily_leetcode

fun main() {
    println(generate(5))
}

fun generate(numRows: Int): List<List<Int>> {
    val pascalTriangle = List(numRows) { mutableListOf(1) }
    for (i in 1 until numRows) {
        for (j in 1 until i) {
            pascalTriangle[i].add(pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j])
        }
        pascalTriangle[i].add(1)
    }

    return pascalTriangle
}