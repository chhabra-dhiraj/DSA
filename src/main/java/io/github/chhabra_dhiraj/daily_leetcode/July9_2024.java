package io.github.chhabra_dhiraj.daily_leetcode;

public class July9_2024 {

    public static void main(String[] args) {
        int[][] customers = {{1,2},{2,5},{4,3}};
        System.out.println(averageWaitingTime(customers));
    }

    public static double averageWaitingTime(int[][] customers) {
        long[] track = new long[2];
        track[0] = customers[0][0] + customers[0][1];
        track[1] = customers[0][1];
        for (int i = 1; i < customers.length; i++) {
            track[0] = (customers[i][0] < track[0] ? track[0] + customers[i][1] : customers[i][0] + customers[i][1]);
            track[1] += track[0] - customers[i][0];
        }
        double result = (double) track[1] / customers.length;
        return Math.round(result * 100000) / 100000.0;
    }
}
