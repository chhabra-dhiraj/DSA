package io.github.chhabra_dhiraj.daily_leetcode;

public class March_23_2025_55_Jump_Game {

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length == 1) {
            return true;
        }

        int targetIndex = nums.length - 1;
        int currentIndex = targetIndex - 1;
        while (currentIndex != 0) {
            if(nums[currentIndex] + currentIndex >= targetIndex) {
                targetIndex = currentIndex;
                currentIndex--;
            } else {
                currentIndex--;
            }
        }

        return nums[currentIndex] + currentIndex >= targetIndex;
    }
}
