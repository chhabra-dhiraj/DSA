package io.github.chhabra_dhiraj.DSA_June_Start;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -7};

        System.out.println(getMaxValue(null));
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
}
