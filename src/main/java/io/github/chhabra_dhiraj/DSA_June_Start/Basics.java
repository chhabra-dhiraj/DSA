package io.github.chhabra_dhiraj.DSA_June_Start;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
//        System.out.println(largestThree(a, b, c));

        System.out.println("================================");
        System.out.println("================================");

        System.out.println(checkUpperCase('z'));
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
}
