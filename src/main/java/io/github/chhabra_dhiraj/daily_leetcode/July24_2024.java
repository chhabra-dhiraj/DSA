package io.github.chhabra_dhiraj.daily_leetcode;

public class July24_2024 {

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
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int[] firstRow = matrix[0];

        Result rowRes = binarySearch(firstRow, target, 0, firstRow.length - 1);
        if (rowRes.isFound()) {
            return true;
        }

        int lastIndexValue = firstRow[rowRes.getLastIndex()];
        if (target == lastIndexValue) {
            return true;
        }

        if (matrix.length == 1) {
            return false;
        }

        int col;
        if (firstRow.length == 1) {
            col = 0;
        } else if (target < lastIndexValue) {
            if (rowRes.getLastIndex() == 0) {
                return false;
            } else {
                int start = 0, end = matrix.length - 1;
                while (start <= end) {
                    int mid = start + ((end - start) / 2);
                    int midEl = matrix[mid][col];

                    if (target == midEl) {
                        return true;
                    }

                    if (target > midEl) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        } else {
            col = rowRes.getLastIndex();
        }

        return false;
    }

    private static Result binarySearch(int[] nums, int target, int start, int end) {
        while (start < end) {
            int mid = start + ((end - start) / 2);
            int midEl = nums[mid];

            if (target == midEl) {
                return new Result(true, mid);
            }

            if (target > midEl) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new Result(false, start);
    }

    static class Result {
        private boolean found;
        private int lastIndex;

        public Result(boolean found, int lastIndex) {
            this.found = found;
            this.lastIndex = lastIndex;
        }

        public boolean isFound() {
            return found;
        }

        public int getLastIndex() {
            return lastIndex;
        }
    }
}
