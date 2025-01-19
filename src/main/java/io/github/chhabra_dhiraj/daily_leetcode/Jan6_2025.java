package io.github.chhabra_dhiraj.daily_leetcode;

public class Jan6_2025 {

    public static void main(String[] args) {
        int[] days = {4, 5, 9, 11, 14, 16, 17, 19, 21, 22, 24};
        int[] costs = {1, 4, 18};

        System.out.println(mincostTickets(days, costs));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int tc = 0;
        int fdw = days[0];
        int fdm = days[0];
        int pwc = 0;
        int pmc = 0;

        for (int i = 0; i < days.length; i++) {
            boolean weekChange = days[i] - fdw >= 7;
            boolean monthChange = days[i] - fdm >= 30;
            boolean lastDay = i == days.length - 1;

            int costSoFar;
            if (weekChange && monthChange) {
                costSoFar = Math.min(tc, Math.min(pwc + costs[1], pmc + costs[2]));
                pwc = costSoFar;
                pmc = costSoFar;
                fdw = days[i];
                fdm = days[i];
            } else if (weekChange) {
                costSoFar = Math.min(tc, pwc + costs[1]);
                pwc = costSoFar;
                fdw = days[i];
            } else if (monthChange) {
                costSoFar = Math.min(tc, pmc + costs[2]);
                pmc = costSoFar;
                fdm = days[i];
            } else {
                costSoFar = tc;
            }

            if (lastDay) {
                tc = Math.min(costSoFar + costs[0], Math.min(pwc + costs[1], pmc + costs[2]));
            } else {
                tc = costSoFar + costs[0];
            }
        }

        return tc;
    }
}
