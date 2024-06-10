package io.github.chhabra_dhiraj.DSA_June_Start;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {-1, -3, 50, 20, -200};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
