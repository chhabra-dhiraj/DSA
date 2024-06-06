package io.github.chhabra_dhiraj;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3};
        System.out.println(maxSumAfterPartitioning(arr, 4));
    }

    public static int maxSumAfterPartitioning(int[] arr, int k) {
        return findSum(arr, findNumPartitionAndLastSize(arr.length, k), k);
    }

    private static int[] findNumPartitionAndLastSize(int arrSize, int k) {
        int num = arrSize / k;
        int rem = arrSize % k;

        if (rem > 0) {
            num += 1;
        }

        return new int[]{num, rem};
    }

    private static int findSum(int[] arr, int[] numPart, int k) {
        Arrays.sort(arr);
        int sum = 0;
        int part = numPart[0];
        int rem = numPart[1];
        int j = arr.length - 1;
        int rep = 0;
        while (j > arr.length - part - rep) {
            if (j != arr.length - 1) {
                if (arr[j + 1] != arr[j]) {
                    sum += arr[j] * k;
                } else {
                    rep += 1;
                }
            } else {
                sum += arr[j] * k;
            }
            j--;
        }
        sum += arr[j] * rem;
        return sum;
    }
}
