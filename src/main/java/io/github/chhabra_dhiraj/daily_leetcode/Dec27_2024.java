package io.github.chhabra_dhiraj.daily_leetcode;

public class Dec27_2024 {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int sum = 0, max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
