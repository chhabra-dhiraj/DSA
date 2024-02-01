package io.github.chhabra_dhiraj;

import java.util.Arrays;

public class BsInterviewQuestions {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 21};
        System.out.println(getCeilingNumber(arr, 20));
        System.out.println("=================================");
        System.out.println("=================================");
        char[] charArr = {'a', 'b', 'd', 'j'};
        System.out.println(getSmallestLetter(charArr, 'c'));
        System.out.println("=================================");
        System.out.println("=================================");
        int[] inflectionArray = {3, 1, 2, 7, 9, 8};
        System.out.println(getInflectionNumber(inflectionArray));
        System.out.println("=================================");
        System.out.println("=================================");
        int[] nums = {1, 5, 5, 8, 9, 10, 24, 48};
        System.out.println(Arrays.toString(getFirstAndLastIndex(nums, 5)));
    }

    // Ceiling of a target number
    private static int getCeilingNumber(int[] arr, int target) {
        if (arr == null || arr.length == 0 || target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = arr[mid];

            if (midElement == target) {
                return mid;
            } else if (target > midElement) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    // Smallest letter greater than target
    private static char getSmallestLetter(char[] letters, char target) {
        if (letters == null || letters.length == 0) {
            return '\u0000';
        }

        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = letters[mid];

            if (target >= midElement) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start];
    }

    private static int getInflectionNumber(int[] arr) {
        if (arr == null || arr.length < 3) {
            return -1;
        }
        for (int i = 1; i <= arr.length - 2; i++) {
            if (checkLeftSide(arr, i) && checkRightSide(arr, i)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean checkLeftSide(int[] arr, int index) {
        int checkElement = arr[index];
        int start = 0;
        int end = index - 1;

        for (int i = end; i >= start; i--) {
            if (checkElement < arr[i]) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkRightSide(int[] arr, int index) {
        int checkElement = arr[index];
        int start = index + 1;
        int end = arr.length - 1;

        for (int i = end; i >= start; i--) {
            if (checkElement > arr[i]) {
                return false;
            }
        }

        return true;
    }

    private static int[] getFirstAndLastIndex(int[] nums, int target) {
        if (nums == null) {
            return new int[] {-1, -1};
        }

        int firstIndex = getIndex(nums, target, false);
        int lastIndex = -1;
        if (firstIndex != -1) {
            lastIndex = getIndex(nums, target, true);
        }

        return new int[]{firstIndex, lastIndex};
    }

    private static int getIndex(int[] nums, int target, boolean toSearchLast) {
        int start = 0;
        int end = nums.length - 1;

        int foundIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = nums[mid];
            if (target == midElement) {
                foundIndex = mid;
                if (toSearchLast) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (target > midElement) {
                start = mid + 1;
            } else if (target < midElement) {
                end = mid - 1;
            }
        }

        return foundIndex;
    }
}
