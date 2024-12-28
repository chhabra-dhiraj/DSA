package io.github.chhabra_dhiraj.daily_leetcode;

public class Dec28_2024 {

    public static void main(String[] args) {
        int[] height = {0, 1, 3, 15, 18, 10, 9, 1, 3};

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int i = 0, j = height.length - 1;
        int maxVol = 0;

        while (i != j) {
            int mi = height[i], mj = height[j];
            int vol = mi <= mj ? mi * (j - i) : mj * (j - i);
            maxVol = Math.max(vol, maxVol);

            if(mi <= mj) {
                i++;
            } else {
                j--;
            }
        }

        return maxVol;
    }
}
