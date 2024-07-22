package io.github.chhabra_dhiraj.daily_leetcode;

public class July22_2024 {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        if (height == null || height.length == 0 || height.length == 1) {
            return 0;
        }

        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int el = height[i];
            for (int j = i + 1; j < height.length; j++) {
                int cEl = height[j];
                int v = Math.min(el, cEl) * (j - i);
                if (v > max) {
                    max = v;
                }
            }
        }
        return max;
    }
}
