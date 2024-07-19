package io.github.chhabra_dhiraj.daily_leetcode;

public class July19_2024 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 4};

        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        if (nums[start] > nums[start + 1]) {
            return start;
        } else {
            start++;
        }

        if (nums[end] > nums[end - 1]) {
            return end;
        } else {
            end--;
        }

        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
