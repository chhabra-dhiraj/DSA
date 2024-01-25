package io.github.chhabra_dhiraj;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 8, 222, 22, 0, 11, 01};
        System.out.println(findMin(arr));
        System.out.println("============================");
        System.out.println("============================");
        System.out.println(findEvenDigitNum(arr));
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
            if (isNumDigitsEven(num)) {
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
}
