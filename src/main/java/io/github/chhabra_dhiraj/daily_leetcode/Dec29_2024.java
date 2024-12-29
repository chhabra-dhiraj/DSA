package io.github.chhabra_dhiraj.daily_leetcode;

public class Dec29_2024 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int pr = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int inv = prices[i];
            int sell = prices[i + 1];

            if (inv < sell) {
                pr += sell - inv;
            }
        }

        return pr;
    }
}
