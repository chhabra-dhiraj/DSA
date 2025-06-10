package io.github.chhabra_dhiraj.DSA_Basic_Structures;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {-2};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1){
            return;
        }

        for (int i = arr.length - 1; i > 0; i--) {
            boolean didSwap = false;
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
