package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.Arrays;

public class Feb18_2025_80_Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return len;
        }

        int currentNum = Integer.MIN_VALUE; // Initialised with some bogus value cannot be present in the array
        int k = 0, countCurrentNum = 0;
        for (int num : nums) {
            if (num == currentNum) {
                countCurrentNum++;
                if (countCurrentNum < 3) {
                    k++;
                    nums[k - 1] = currentNum;
                }
            } else {
                currentNum = num;
                countCurrentNum = 1;
                k++;
                nums[k - 1] = currentNum;
            }
        }

        return k;
    }
}
