package io.github.chhabra_dhiraj.DSA_June_Start;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {24, 9, 8, -2, -4};

        System.out.println(binarySearch(arr, 27));

        System.out.println("=================================");
        System.out.println("=================================");

        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        System.out.println(Arrays.toString(binarySearchMatrix(matrix, 10)));
    }

    private static int binarySearch(int[] arr, int element) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0, end = arr.length - 1;

        boolean isAsc = arr[end] > arr[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mElement = arr[mid];
            if (element == mElement) {
                return mid;
            }

            if (element > mElement) {
                if (isAsc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (isAsc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    private static int[] searchRowColSortedMatrix(int[][] matrix, int target) {
        int row = 0, column = matrix.length - 1;
        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column]) {
                return new int[]{row, column};
            }

            if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }
        }

        return new int[]{-1, -1};
    }
}
