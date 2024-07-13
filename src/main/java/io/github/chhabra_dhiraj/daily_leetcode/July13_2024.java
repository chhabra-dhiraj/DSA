package io.github.chhabra_dhiraj.daily_leetcode;

public class July13_2024 {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,1,2,3};

        System.out.println(search(nums, 8));
    }

    public static int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int midElement = nums[mid];
            int startElement = nums[start];
            int endElement = nums[end];
            if (target == midElement) {
                return mid;
            }

            if(target == startElement) {
                return start;
            }

            if (target == endElement) {
                return end;
            }

            if (target > midElement) {
                if(endElement > startElement) {
                    start = mid + 1;
                } else if (endElement > midElement) {
                    if(target < endElement) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    start = mid  + 1;
                }
            } else {
                if(endElement > startElement) {
                    end = mid - 1;
                } else if (endElement > midElement) {
                    end = mid - 1;
                } else {
                    if (target > startElement) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }

        return -1;
    }
}