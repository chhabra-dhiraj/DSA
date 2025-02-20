package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.Arrays;

public class Feb20_2025_238_Product_of_Array_Except_Self {

    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                answer[i] = 1;
            } else {
                answer[i] = answer[i - 1] * nums[i - 1];
            }
        }

        int rightProduct = 0;
        for (int j = len - 1; j >= 0; j--) {
            if (j == len - 1) {
                rightProduct = 1;
            } else {
                rightProduct *= nums[j + 1];
            }
            answer[j] *= rightProduct;
        }

        return answer;
    }
}
