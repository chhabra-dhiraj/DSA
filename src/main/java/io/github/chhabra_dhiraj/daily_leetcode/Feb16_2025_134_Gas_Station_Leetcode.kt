package io.github.chhabra_dhiraj.daily_leetcode

fun main() {
    val gas = intArrayOf(2, 3, 4)
    val cost = intArrayOf(3, 4, 3)

    println(canCompleteCircuit(gas, cost))
}

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {

    var startIndex = 0

    var currentIndex = 0
    fun updateCurrentIndex() {
        currentIndex++
        currentIndex %= gas.size
    }

    var totalGasLeft = 0
    var allIndexCovered = false
    while (true) {
        totalGasLeft += gas[currentIndex] - cost[currentIndex]
        if (totalGasLeft >= 0) {
            updateCurrentIndex()
            if (startIndex == currentIndex) return startIndex
        } else {
            if (allIndexCovered) return -1
            updateCurrentIndex()
            startIndex = currentIndex
            totalGasLeft = 0
        }
        allIndexCovered = if (!allIndexCovered) currentIndex == gas.lastIndex else true
    }
}

