package io.github.chhabra_dhiraj.daily_leetcode

fun main() {
    val nums = intArrayOf(100, 4, 200, 1, 3, 2)

    println(longestConsecutive(nums))
}

fun longestConsecutive(nums: IntArray): Int {
    val size = nums.size
    if (size == 0 || size == 1) return size

    nums.sort()
    var max = 1
    var count = 1
    for (i in 0..<nums.lastIndex) {
        val el = nums[i]
        val nEl = nums[i + 1]
        if (el + 1 == nEl) {
            count++
            if (count > max) max = count
        } else {
            if (el == nEl) continue
            count = 1
        }
    }

    return max
}