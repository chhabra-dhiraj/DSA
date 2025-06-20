package io.github.chhabra_dhiraj.daily_leetcode

fun main() {
    val intervals = arrayOf(intArrayOf(2, 6), intArrayOf(1, 3), intArrayOf(8, 10), intArrayOf(15, 18))
    val r = merge(intervals)
    r.forEach {
        print(it.contentToString())
    }
}

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    if (intervals.size == 1) return intervals

    val mL = intervals.toMutableList()
    mL.sortBy {
        it[0]
    }

    var i = 0
    while (i < mL.lastIndex) {
        val f = mL[i]
        val s = mL[i + 1]

        val fS = f[1]
        val sS = s[1]
        when {
            fS < s[0] -> {
                i++
            }

            fS >= s[0] && fS < sS -> {
                mL[i][0] = f[0]; mL[i][1] = sS
                mL.removeAt(i + 1)
            }

            else -> {
                mL.removeAt(i + 1)
            }
        }
    }

    return mL.toTypedArray()
}