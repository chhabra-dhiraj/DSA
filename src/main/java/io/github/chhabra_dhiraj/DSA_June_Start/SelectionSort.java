package io.github.chhabra_dhiraj.DSA_June_Start;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {-1, -3};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = max(arr, i);
            swap(arr, i, maxIndex);
        }
    }

    private static int max(int[] arr, int e) {
        int max = 0;
        for (int i = 1; i <= e; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
