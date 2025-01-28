package io.github.chhabra_dhiraj.daily_leetcode;

public class Jan6_2025 {

    public static void main(String[] args) {
        int[] days = {4, 5, 9, 11, 14, 16, 17, 19, 21, 22, 24};
        int[] costs = {1, 4, 18};

        System.out.println(mincostTickets(days, costs));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int dailyCost = costs[0];
        int weeklyCost = costs[1];
        int monthlyCost = costs[2];
        int numTravelDays = days.length;

        if (numTravelDays == 1) {
            return Math.min(monthlyCost, Math.min(dailyCost, weeklyCost));
        }

        int[] pointOptimizedCost = new int[numTravelDays];

        int firstDayWeekInd = 0, firstDayMonthInd = 0;

        for (int i = 0; i < numTravelDays; i++) {
            if(i == 0) {
                pointOptimizedCost[0] = dailyCost;
                continue;
            }
            int firstDayWeek = days[firstDayWeekInd];
            int currentDay = days[i];

            if(currentDay - firstDayWeek >= 7) {
                int optimizedCostBeforeCurrentWeek = firstDayWeek > 0 ? pointOptimizedCost[firstDayWeek - 1] : 0;
                int weekConsideredOptimizedCost = optimizedCostBeforeCurrentWeek + weeklyCost + dailyCost;
                int dayConsideredOptimizedCost = pointOptimizedCost[i - 1] + dailyCost;
                pointOptimizedCost[i] = Math.min(weekConsideredOptimizedCost, dayConsideredOptimizedCost);
                firstDayWeekInd++;
            }
        }

        return pointOptimizedCost[numTravelDays - 1];
    }
}
