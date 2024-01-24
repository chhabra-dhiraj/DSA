package io.github.chhabra_dhiraj;

public class Strings {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("abccba"));
        printPalindromicSubstrings("abccba");
    }

    private static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0 || str.length() == 1) {
            return true;
        }
        str = str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static void printPalindromicSubstrings(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Null or Empty String");
            return;
        }

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindrome(ss)) {
                    System.out.println(ss);
                }
            }
        }
    }
}
