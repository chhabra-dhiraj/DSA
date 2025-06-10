package io.github.chhabra_dhiraj.DSA_Basic_Structures;

public class Strings {

    public static void main(String[] args) {
        String str = "aa";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        if(str == null || str.isBlank() || str.length() == 1) {
            return true;
        }

        str = str.toLowerCase();

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
