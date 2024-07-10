package io.github.chhabra_dhiraj.daily_leetcode;

public class July9_2024 {

    public static void main(String[] args) {
        int[][] customers = {{1, 2}, {2, 5}, {4, 3}};
        System.out.println(averageWaitingTime(customers));
        System.out.println("=========================================");
        System.out.println("=========================================");
//        System.out.println(averageWaitingTimeOptimized(customers));
    }

    // Brute Force
    public static double averageWaitingTime(int[][] customers) {
        long[] track = {customers[0][0] + customers[0][1], customers[0][1]};
        for (int i = 1; i < customers.length; i++) {
            track[0] = (customers[i][0] < track[0] ? track[0] + customers[i][1] : customers[i][0] + customers[i][1]);
            track[1] += track[0] - customers[i][0];
        }
        double result = (double) track[1] / customers.length;
        return Math.round(result * 100000) / 100000.0;
    }

    // TODO: To be done later
//    // Optimized
//    public static double averageWaitingTimeOptimized(int[][] customers) {
//        double result = (double) getTrack(customers, 0, customers.length - 1)[1] / customers.length;
//        return Math.round(result * 100000) / 100000.0;
//    }
//
//    private static long[] getTrack(int[][] customers, int start, int end) {
//        if (start > end) {
//            return new long[]{0, 0};
//        }
//
//        int mid = start + ((end - start) / 2);
//
//        long[] leftTrack = getTrack(customers, start, mid - 1);
//        long[] rightTrack = getTrack(customers, mid + 1, end);
//        if (start != end) {
//            rightTrack[0] = customers[mid + 1][0];
//        }
//        long[][] averagedCustomers = {leftTrack, {(long) customers[mid][0], (long) customers[mid][1]}, rightTrack};
//        long[] track = {averagedCustomers[0][0] + averagedCustomers[0][1], averagedCustomers[0][1]};
//
//        for (int i = 1; i < averagedCustomers.length; i++) {
//            track[0] = (averagedCustomers[i][0] < track[0] ? track[0] + averagedCustomers[i][1] : averagedCustomers[i][0] + averagedCustomers[i][1]);
//            track[1] += track[0] - averagedCustomers[i][0];
//        }
//
//        return track;
//    }
}
