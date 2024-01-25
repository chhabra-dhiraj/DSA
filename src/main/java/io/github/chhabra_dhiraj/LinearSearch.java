package io.github.chhabra_dhiraj;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 8, 222, 22, 0, 11, 01};
        System.out.println(findMin(arr));
        System.out.println("============================");
        System.out.println("============================");
        System.out.println(findEvenDigitNum(arr));
        System.out.println("============================");
        System.out.println("============================");
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(accounts));
    }

    private static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int next = arr[i];
            if (min > arr[i]) {
                min = next;
            }
        }

        return min;
    }

    private static int findEvenDigitNum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int count = 0;

        for (int num : arr) {
            if (isNumDigitsEvenOptimized(num)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isNumDigitsEven(int num) {
        if (num == 0) {
            return false;
        }

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count % 2 == 0;
    }

    private static boolean isNumDigitsEvenOptimized(int num) {
        if (num == 0) {
            return false;
        }

        int count = (int) Math.log10(num) + 1;

        return count % 2 == 0;
    }

    // Richest wealth question
    private static int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0) {
            return 0;
        }

        int max = getAccountWealth(accounts[0]);
        for (int[] account : accounts) {
            int accountWealth = getAccountWealth(account);
            if (max < accountWealth) {
                max = accountWealth;
            }
        }
        return max;
    }

    private static int getAccountWealth(int[] account) {
        if (account == null || account.length == 0) {
            return 0;
        }

        int wealth = 0;

        for (int m : account) {
            wealth += m;
        }

        return wealth;
    }
}
