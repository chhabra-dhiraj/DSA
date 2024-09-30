package io.github.chhabra_dhiraj.daily_leetcode;

public class Sep_28_2024 {

    public static void main(String[] args) {
        int[] nums = {3,0,1};

        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int s = 0, e = nums.length - 1;
        int sE = nums[s], eE = nums[e];

        if (sE != 0) {
            return 0;
        }

        if (eE != nums.length - 1) {
            return eE - 1;
        }


        while (s < e) {
            int m = ((e - s) / 2) + s;
            int mE = nums[m];

            if (mE != nums[m - 1] + 1) {
                return mE;
            }

            if (mE > m) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return nums[s];
    }
}
