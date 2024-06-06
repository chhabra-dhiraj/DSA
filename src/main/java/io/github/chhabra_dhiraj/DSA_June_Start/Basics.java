package io.github.chhabra_dhiraj.DSA_June_Start;

public class Basics {
    public static void main(String[] args) {
        System.out.println(largestThree(4, 6, 10));

        System.out.println("================================");
        System.out.println("================================");

        System.out.println(checkUpperCase('Z'));

        System.out.println("================================");
        System.out.println("================================");

        System.out.println(calFibonacciNum(8));

        System.out.println("================================");
        System.out.println("================================");

        System.out.println(countOccurrences(27, 3));

        System.out.println("================================");
        System.out.println("================================");

        System.out.println(reverseNum(-245));
    }

    private static int largestThree(int a, int b, int c) {
        if (a == Integer.MAX_VALUE || b == Integer.MAX_VALUE || c == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    private static boolean checkUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    private static int calFibonacciNum(int index) {
        if (index == 0 || index == 1) {
            return index;
        }

        int last = 1, secondLast = 0, num = 0;
        for (int i = 2; i <= index; i++) {
            num = last + secondLast;
            secondLast = last;
            last = num;
        }

        return num;
    }

    private static int countOccurrences(int num, int digit) {
        int absNum = Math.abs(num);
        int count = 0;

        while(absNum > 0) {
            int numDigit = absNum % 10;
            if (numDigit == digit) {
                count++;
            }
            absNum = absNum / 10;
        }

        return count;
    }

    private static int reverseNum(int num) {
        int absNum = Math.abs(num);
        int reverseNum = 0;

        while(absNum > 0) {
            int numDigit = absNum % 10;
            absNum = absNum / 10;
            reverseNum = reverseNum * 10 + numDigit;
        }

         if(num > 0) return reverseNum; else return -reverseNum;
    }
}
