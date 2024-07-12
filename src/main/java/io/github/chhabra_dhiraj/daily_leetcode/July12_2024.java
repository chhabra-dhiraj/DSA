package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.ArrayList;

public class July12_2024 {

    public static void main(String[] args) {
        String s = "babeaaabbafaaabbnaabuaaaaagabbaabbbbbmaaanaasaebbvlaaabbbaibabbbabaaabasbbryqraryobuabguabaabbmabgubabbaaraaaabapbaabsbbbbbbbbahabbbsanaajbabarbntbqagkbababbabbbbaabaybagababaabbzaaaaaaambwabbbaababmxqbbgbabbbabbbbbaakabaabzabbabfabjbobabaaaabbbaaaaaaaajbbbaqrabnarsaabbbaabaabavgbaaabtmcbbababbbubaaababaedbbtabbalkababiaaaabbaafabaabtvbbzayaaaakzbdafbasbaabbsbbarbebaaboyabbabnyamabbbfubaaebabaababbbbbqxajaaaamfabbabbbapbubaabbehbbnaandabmxbqcaaqbyaabbamafbaufaabblbbbbabbaabgbdbbnbaababaiauaybbtnbnaayasgafadbabblabbbaababbtsbabapbdaaasxxafakaaaaabrbbcabaahzbaaajbbbbbhaabbabbtbababbababaxabaaaipabbxbaagbaaabba";
        int x = 7275, y = 9407;
        System.out.println(maximumGain(s, x, y));
    }

    public static int maximumGain(String s, int x, int y) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return 0;
        }

        int priorityPoint, otherPoint;
        char priorityChar, otherChar;

        if (x > y) {
            priorityChar = 'a';
            priorityPoint = x;
            otherChar = 'b';
            otherPoint = y;
        } else {
            priorityChar = 'b';
            priorityPoint = y;
            otherChar = 'a';
            otherPoint = x;
        }

        int points = 0;
        ArrayList<Character> priorityBucket = new ArrayList<>();
        ArrayList<Character> otherBucket = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == priorityChar) {
                priorityBucket.add(ch);
            } else if (ch == otherChar) {
                if (!priorityBucket.isEmpty() && priorityBucket.get(priorityBucket.size() - 1) == priorityChar) {
                    points += priorityPoint;
                    priorityBucket.remove(priorityBucket.size() - 1);
                } else {
                    otherBucket.add(ch);
                }
            } else {
                points += Math.min(priorityBucket.size(), otherBucket.size()) * otherPoint;
                priorityBucket.clear();
                otherBucket.clear();
            }
        }

        points += Math.min(priorityBucket.size(), otherBucket.size()) * otherPoint;
        return points;
    }
}
