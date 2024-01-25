package io.github.chhabra_dhiraj;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-2, -1, 3, 4, 5};
        System.out.println(basicBinarySearch(arr, 5));
    }

    private static int basicBinarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = arr[mid];
            if (midElement == target) {
                return mid;
            } else if (midElement < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
