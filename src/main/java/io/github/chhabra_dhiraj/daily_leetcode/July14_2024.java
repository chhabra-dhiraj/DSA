package io.github.chhabra_dhiraj.daily_leetcode;

public class July14_2024 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return -1;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(num == nums[j]) {
                    return num;
                }
            }
        }

        return -1;
    }
}
