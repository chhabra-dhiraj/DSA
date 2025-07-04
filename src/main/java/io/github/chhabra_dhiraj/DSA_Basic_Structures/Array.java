package io.github.chhabra_dhiraj.DSA_Basic_Structures;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -7};

        System.out.println(getMaxValue(null));

        System.out.println("==================");
        System.out.println("==================");

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int getMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;

        if (arr == null) {
            return max;
        }
        for (int element: arr) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    private static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }

        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
