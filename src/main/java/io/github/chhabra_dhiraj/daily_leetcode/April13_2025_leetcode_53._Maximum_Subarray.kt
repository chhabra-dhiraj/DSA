package io.github.chhabra_dhiraj.daily_leetcode

import kotlin.math.max

fun main() {
    val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)

    println(maxSubArray(nums))
}

fun maxSubArray(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]

    var max = Int.MIN_VALUE
    var sum = 0
    nums.forEach {
        sum += it
        sum = max(it, sum)
        max = max(max, sum)
    }

    return max
}