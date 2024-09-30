package io.github.chhabra_dhiraj.daily_leetcode;

public class Sep_30_2024 {

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};

        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return -1; // Not possible i.e. invalid case
        }

        int max = nums.length - 1;

        boolean f = false;
        for (int i = 1; i <= max; i++) {
            for (int num : nums) {
                if(num == i) {
                    if (!f) {
                        f = true;
                    } else {
                        return i;
                    }
                }
            }
            f = false;
        }

        return -1; // Not possible because assumption: nums must have one duplicate number
    }
}
