package io.github.chhabra_dhiraj.DSA_June_Start;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 6, 7};

        System.out.println(binarySearch(arr, 7));
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
            }

            if (element < mElement) {
                if (isAsc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
