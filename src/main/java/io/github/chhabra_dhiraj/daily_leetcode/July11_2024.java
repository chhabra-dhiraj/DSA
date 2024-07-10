package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.ArrayList;

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

        ArrayList<String> inFolders = new ArrayList<>();
        inFolders.add(MAIN_FOLDER);

        for (String operation : logs) {
            int lastIndex = inFolders.size() - 1;
            String current = inFolders.get(lastIndex);
            if (operation.charAt(0) == CURRENT_FOLDER_NOTATION) {
                if (operation.charAt(1) == CURRENT_FOLDER_NOTATION) {
                    if (!current.equals(MAIN_FOLDER)) {
                        inFolders.remove(lastIndex);
                    }
                }
            } else {
                String newFolder = operation.substring(0, operation.length() - 1);
                inFolders.add(newFolder);
            }
        }

        return inFolders.size() - 1;
    }
}
