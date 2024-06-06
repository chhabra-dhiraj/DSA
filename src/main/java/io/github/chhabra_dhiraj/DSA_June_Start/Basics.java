package io.github.chhabra_dhiraj.DSA_June_Start;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
//        System.out.println(largestThree(a, b, c));

        System.out.println("================================");
        System.out.println("================================");

        System.out.println(checkUpperCase('Z'));

        System.out.println("================================");
        System.out.println("================================");

        System.out.println(calFibonacciNum(8));
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
}
