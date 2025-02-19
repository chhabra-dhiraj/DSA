package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.Arrays;

public class Feb19_2025_189_Rotate_Array {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 2;

        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if (len == 1 || k == 0) {
            return;
        }

        int startCycleIndex = 0, currentIndex = startCycleIndex;
        int currentNum = nums[currentIndex];
        for (int i = 0; i < len; i++) {
            int swapIndex = (currentIndex + k) % len;
            int swapNum = nums[swapIndex];
            nums[swapIndex] = currentNum;
            currentIndex = swapIndex;
            if (currentIndex == startCycleIndex) {
                startCycleIndex++;
                currentIndex = startCycleIndex;
                currentNum = nums[currentIndex];
            } else {
                currentNum = swapNum;
            }
        }
    }
}
