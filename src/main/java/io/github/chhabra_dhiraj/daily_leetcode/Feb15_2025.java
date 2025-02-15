package io.github.chhabra_dhiraj.daily_leetcode;

public class Feb15_2025 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int s = 0, pS = 0;
        for (int num: nums) {
            int nS = pS + num;
            if(nS >= s) {
                pS = s;
                s = nS;
            } else {
                pS = s;
            }
        }

        return s;
    }
}
