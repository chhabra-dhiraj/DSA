package io.github.chhabra_dhiraj;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 8};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            int next = arr[i];
            if(min > arr[i]) {
                min = next;
            }
        }

        return min;
    }
}
