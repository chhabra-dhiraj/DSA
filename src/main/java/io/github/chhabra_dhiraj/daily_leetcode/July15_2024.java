package io.github.chhabra_dhiraj.daily_leetcode;

public class July15_2024 {

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;
        int startEl = nums[start];
        int endEl = nums[end];
        if (endEl > startEl) {
            return startEl;
        }

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int middleEl = nums[mid];
            int before = mid != 0 ? mid - 1 : nums.length - 1;
            int after = mid != nums.length - 1 ? mid + 1 : 0;

            if (middleEl < nums[before] && middleEl < nums[after]) {
                return middleEl;
            }

            if (middleEl < startEl) {
                end = before;
            } else {
                start = after;
            }
        }

        return Integer.MIN_VALUE; // This is never possible for a unique elements array. So, it will never come here
    }
}
