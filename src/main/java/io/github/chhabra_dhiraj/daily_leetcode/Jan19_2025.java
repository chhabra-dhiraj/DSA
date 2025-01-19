package io.github.chhabra_dhiraj.daily_leetcode;

public class Jan19_2025 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};

        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int lastIndex = nums.length - 1;
        if (lastIndex == 0) {
            return lastIndex;
        }

        int start = 0, end = lastIndex;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int midEl = nums[mid];

            int leftEl = mid != 0 ? nums[mid - 1] : Integer.MIN_VALUE;
            int rightEl = mid != lastIndex ? nums[mid + 1] : Integer.MIN_VALUE;

            if (midEl > leftEl && midEl > rightEl) {
                return mid;
            }

            if (leftEl > rightEl) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
