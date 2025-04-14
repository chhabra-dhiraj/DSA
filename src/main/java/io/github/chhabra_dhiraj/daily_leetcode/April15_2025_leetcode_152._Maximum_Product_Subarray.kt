package io.github.chhabra_dhiraj.daily_leetcode

import kotlin.math.max

fun main() {
    val nums = intArrayOf(2, -5, -2, -4, 3, -1, -5)

    println(maxProduct(nums))
}

fun maxProduct(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]

    var max = Int.MIN_VALUE
    var negativeProduct = 1
    var product = 1
    nums.forEach {
        product *= it

        when {
            product > 0 -> {
                max = max(max, product)
            }

            product == 0 -> {
                max = max(max, product)
                negativeProduct = 1
                product = 1
            }

            else -> {
                if (negativeProduct != 1) {
                    product *= negativeProduct
                    negativeProduct = 1
                    max = max(max, product)
                } else {
                    max = max(max, it)
                    negativeProduct = product
                    product = 1
                }
            }
        }
    }

    negativeProduct = 1
    product = 1
    nums.forEachReversed {
        product *= it

        when {
            product > 0 -> {
                max = max(max, product)
            }

            product == 0 -> {
                max = max(max, product)
                negativeProduct = 1
                product = 1
            }

            else -> {
                if (negativeProduct != 1) {
                    product *= negativeProduct
                    negativeProduct = 1
                    max = max(max, product)
                } else {
                    max = max(max, it)
                    negativeProduct = product
                    product = 1
                }
            }
        }
    }

    return max
}

inline fun IntArray.forEachReversed(action: (Int) -> Unit) {
    for (i in (this.lastIndex downTo 0)) action(this[i])
}