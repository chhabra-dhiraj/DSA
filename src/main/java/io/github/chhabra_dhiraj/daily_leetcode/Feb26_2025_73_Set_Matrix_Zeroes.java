package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.Arrays;

public class Feb26_2025_73_Set_Matrix_Zeroes {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        setZeroes(matrix);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void setZeroes(int[][] matrix) {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;
        if (numRows < 2 && numColumns < 2) {
            return;
        }

        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (matrix[i][j] == 0) {
                    if (j == 0) {
                        isFirstColumnZero = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
            if(i == 0) {
                isFirstRowZero = matrix[0][0] == 0;
            }
        }

        for (int i = 1; i < numRows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < numColumns; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < numColumns; j++) {
            if (matrix[0][j] == 0) {
                if(j != 0 || isFirstColumnZero) {
                    for (int i = 1; i < numRows; i++) {
                        matrix[i][j] = 0;
                    }
                }
            }
            if (isFirstRowZero) {
                matrix[0][j] = 0;
            }
        }
    }
}
