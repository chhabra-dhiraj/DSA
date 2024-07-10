package io.github.chhabra_dhiraj.daily_leetcode;

public class July11_2024 {

    private static final String MAIN_FOLDER = "main";
    private static final char CURRENT_FOLDER_NOTATION = '.';

    public static void main(String[] args) {
        String[] logs = {"d1/", "d2/", "./", "d3/", "d31/", "d31/"};

        System.out.println(minOperations(logs));
    }

    private static int minOperations(String[] logs) {
        if (logs == null || logs.length == 0) {
            return 0;
        }

        int depth = 0;
        for (String operation : logs) {
            if (operation.charAt(0) == CURRENT_FOLDER_NOTATION) {
                if (operation.charAt(1) == CURRENT_FOLDER_NOTATION) {
                    if (depth != 0) {
                        depth--;
                    }
                }
            } else {
                depth++;
            }
        }

        return depth;
    }
}
