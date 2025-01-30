package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan29_2025 {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        ArrayList<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            Integer prevElement = i != 0 ? nums[i - 1] : null;
            if (i == 0) {
                if (element == 0) {
                    if (nums[i + 1] == 0 && nums[i + 2] == 0) {
                        triplets.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
                        return triplets;
                    }
                } else if (element > 0) {
                    return triplets;
                }
            }

            if (prevElement != null && element == prevElement) {
                i++;
                continue;
            }

            if (element == 0) {
                if (nums[i + 1] == 0 && nums[i + 2] == 0) {
                    triplets.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
                }
            } else if (element < 0) {
                int positiveSum = 0;
                int j = nums.length - 1;
                while (true) {
                    int positiveElement = nums[j];
                    int elementAbs = Math.abs(element);
//                if(Math.log(elementAbs, positiveElement) > 0 && Math.)
//
//                }
                }
            }
        }
        return triplets;
    }
}
