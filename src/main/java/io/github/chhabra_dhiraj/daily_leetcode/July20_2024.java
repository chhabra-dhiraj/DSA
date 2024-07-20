package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.HashMap;

public class July20_2024 {

    public static void main(String[] args) {
        int[] nums = {5, 7, -24, 12, 13, 2, 3, 12, 5, 6, 35};

        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int count = 0;
            if (i == nums.length - 1) {
                count = 1;
                hashMap.put(nums[i], count);
                max = count;
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] > nums[i]) {
                    int value = hashMap.get(nums[j]);
                    if(count < value) {
                        count = value;
                    }
                }
            }
            count += 1;
            hashMap.put(nums[i], count);
            if(max < count) {
                max = count;
            }
        }

        return max;
    }
}
