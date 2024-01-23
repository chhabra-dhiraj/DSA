package io.github.chhabra_dhiraj;

public class Strings {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("abccba"));
    }

    private static boolean isPalindrome(String str) {
        String lowerStr = str.toLowerCase();
        int i = 0;
        int j = lowerStr.length() - 1;

        while (i < j) {
            if (lowerStr.charAt(i) != lowerStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
