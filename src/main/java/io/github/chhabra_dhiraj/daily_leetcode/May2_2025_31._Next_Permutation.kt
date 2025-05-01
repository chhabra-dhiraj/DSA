package io.github.chhabra_dhiraj.daily_leetcode

fun main() {
    val nums = intArrayOf(1, 2, 3)

    nextPermutation(nums)

    println(nums.contentToString())
}

fun nextPermutation(nums: IntArray) {
    if (nums.size <= 1) return

    val lastIndex = nums.lastIndex
    for (i in lastIndex - 1 downTo 0) {
        val el = nums[i]
        if (el < nums[i + 1]) {
            var s = i + 1;
            var e = lastIndex
            var isIncPlaced = false
            while (s < e) {
                if (!isIncPlaced && nums[e] > el) {
                    swap(nums, i, e)
                    isIncPlaced = true
                }

                swap(nums, s, e)
                s++; e--
            }

            if (isIncPlaced) return

            for (j in s..lastIndex) {
                if (nums[j] > el) {
                    swap(nums, i, j)
                    return
                }
            }
        } else continue
    }

    var s = 0;
    var e = lastIndex
    while (s < e) {
        swap(nums, s, e)
        s++; e--
    }
}