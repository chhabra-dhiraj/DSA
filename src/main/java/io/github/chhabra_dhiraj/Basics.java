package io.github.chhabra_dhiraj;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        playGround();
        int x = 23040;
        int numDigits = getNumDigits(x);
        int reversedNumber = getReversedNumber(x, numDigits);
        System.out.println(numDigits);
        System.out.println(reversedNumber);
    }

    private static int getNumDigits(int x) {
        int numDigits = 0;

        while (((x / (int) Math.pow(10, numDigits))) != 0) {
            numDigits++;
        }

        return numDigits;
    }

    private static int getReversedNumber(int x, int numDigits) {
        int reversedNumber = 0;
        for (int i = 1; i <= numDigits; i++) {
            int digit = ((x % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1));
            reversedNumber = reversedNumber + (digit * (int) Math.pow(10, numDigits - i));
        }
        return reversedNumber;
    }

    private static void playGround() {
        System.out.println("=============================");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("=============================");

        switch (number) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
        }

        System.out.println("=============================");
        System.out.println("=============================");
    }

    public static void ol(int a) {

    }

    static void ol() {

    }
}
