package io.github.chhabra_dhiraj.daily_leetcode;

public class July17_2024 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 8, 8}; // This is assumed to contain one and only duplicate element

        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + ((end - start) / 2);
            int midElement = nums[mid];

            if (midElement == nums[mid - 1]) {
                if ((end - mid) % 2 == 0) {
                    end = mid - 2;
                } else {
                    start = mid + 1;
                }
            } else if (midElement == nums[mid + 1]) {
                if ((end - mid) % 2 != 0) {
                    end = mid - 1;
                } else {
                    start = mid + 2;
                }
            } else {
                return midElement;
            }

        }

        return nums[start];
    }
}
