package io.github.chhabra_dhiraj.DSA_Basic_Structures;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};

        cyclicSortNConsec(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSortNConsec(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return;
        }

        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
