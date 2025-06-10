package io.github.chhabra_dhiraj.DSA_Basic_Structures;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {24, 9, 8, -2, -4};

        System.out.println(binarySearch(arr, 27));

        System.out.println("=================================");
        System.out.println("=================================");

        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        System.out.println(Arrays.toString(searchRowColSortedMatrix(matrix, 10)));

        System.out.println("=================================");
        System.out.println("=================================");

        int[][] matrix2 = {{10}, {15}, {28}, {33}};
        System.out.println(Arrays.toString(binarySearch2D(matrix2, 28)));
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

    private static int[] binarySearch2D(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }


        int rStart = 0, rEnd = matrix.length - 1;
        int cStart = 0, cEnd = matrix[0].length - 1;
        int midCol = (cEnd - cStart) / 2;

        if(matrix.length == 1) {
            return binarySearch2DColRange(matrix, target, rStart, cStart, cEnd);
        }

        while (rEnd - rStart > 1) {
            int midRow = rStart + (rEnd - rStart) / 2;
            int midElement = matrix[midRow][midCol];

            if (target == midElement) {
                return new int[]{midRow, midCol};
            }

            if (target > midElement) {
                rStart = midRow;
            } else {
                rEnd = midRow;
            }
        }

        if (target == matrix[rStart][midCol]) {
            return new int[]{rStart, midCol};
        }

        if (target == matrix[rEnd][midCol]) {
            return new int[]{rEnd, midCol};
        }

        if (matrix[0].length > 1) {
            if(target < matrix[rStart][midCol]) {
                return binarySearch2DColRange(matrix, target, rStart, cStart, midCol - 1);
            } else if(target < matrix[rStart][cEnd]){
                return binarySearch2DColRange(matrix, target, rStart, midCol + 1, cEnd);
            } else if(target < matrix[rEnd][midCol]) {
                return binarySearch2DColRange(matrix, target, rEnd, cStart, midCol - 1);
            } else {
                return binarySearch2DColRange(matrix, target, rEnd, midCol + 1, cEnd);
            }
        }

        return new int[]{-1, -1};
    }

    private static int[] binarySearch2DColRange(int[][] matrix, int target, int row, int cStart, int cEnd) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            int mElement = matrix[row][mid];
            if (target == mElement) {
                return new int[]{row, mid};
            }

            if (target > mElement) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
