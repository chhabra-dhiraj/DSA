package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.Arrays;

public class Jan28_2025 {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        int[] colorsCount = new int[3];

        for (int color : nums) {
            if (color == 0) {
                colorsCount[0]++;
            } else if (color == 1) {
                colorsCount[1]++;
            } else {
                colorsCount[2]++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (colorsCount[0] != 0) {
                insertColor(nums, colorsCount, i, 0, 0);
            } else if (colorsCount[1] != 0) {
                insertColor(nums, colorsCount, i, 1, 1);
            } else if (colorsCount[2] != 0) {
                insertColor(nums, colorsCount, i, 2, 2);
            }
        }
    }

    private static void insertColor(int[] nums, int[] colorsCount, int insertInd, int colorInd, int colorVal) {
        nums[insertInd] = colorVal;
        colorsCount[colorInd]--;
    }
}
