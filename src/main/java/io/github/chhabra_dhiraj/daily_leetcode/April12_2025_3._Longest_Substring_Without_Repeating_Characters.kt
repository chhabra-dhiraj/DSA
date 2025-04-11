package io.github.chhabra_dhiraj.daily_leetcode

import kotlin.math.max

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0

    if (s.length == 1) return 1

    var max = 1
    val subMap = mutableMapOf<Char, Int>()
    var i = 0
    while (i in s.indices) {
        val ch = s[i]
        val isDuplicate = subMap.containsKey(ch)
        if (!isDuplicate) {
            subMap[ch] = i
            i++
        } else {
            max = max(subMap.size, max)
            i = subMap[ch]!! + 1
            subMap.clear()
        }
    }

    return max(subMap.size, max)
}