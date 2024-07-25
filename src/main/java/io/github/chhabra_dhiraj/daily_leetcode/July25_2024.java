package io.github.chhabra_dhiraj.daily_leetcode;

public class July25_2024 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 5;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int i = matrix[0].length - 1;
        int j = 0;

        while(i >= 0 && j < matrix.length) {
            int el = matrix[j][i];
            if(el == target) {
                return true;
            }

            if (target > el) {
                j++;
            } else {
                i--;
            }
        }

        return false;
    }
}
