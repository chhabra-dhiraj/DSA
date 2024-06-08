package io.github.chhabra_dhiraj.DSA_June_Start;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = null;
        System.out.println(countEvenDigitNum(nums));
    }

    private static int countEvenDigitNum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int num : nums) {
            if (countNumDigitsOpt(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int countNumDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int absNum = Math.abs(num);

        int count = 0;

        while (absNum > 0) {
            absNum = absNum / 10;
            count++;
        }

        return count;
    }

    private static int countNumDigitsOpt(int num) {
        if (num == 0) {
            return 1;
        }

        int absNum = Math.abs(num);

        return (int) (Math.log10(absNum)) + 1;
    }
}
