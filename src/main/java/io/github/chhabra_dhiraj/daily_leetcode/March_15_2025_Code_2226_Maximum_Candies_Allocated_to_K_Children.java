package io.github.chhabra_dhiraj.daily_leetcode;

import java.util.Arrays;

public class March_15_2025_Code_2226_Maximum_Candies_Allocated_to_K_Children {

    public static void main(String[] args) {
        int[] candies = {4, 7, 5};
        int k = 4;

        System.out.println(maximumCandies(candies, k));
    }

    public static int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);

        int numPiles = candies.length;
        int lastIterationIndex = numPiles > k ? Math.toIntExact(numPiles - k) : 0;
        int maxAverageCandies = 0;
        long totalCandiesSoFar = 0;
        for (int i = numPiles - 1; i >= lastIterationIndex; i--) {
            int lowestCandiesPileSoFar = candies[i];
            totalCandiesSoFar += lowestCandiesPileSoFar;
            int averageCandiesSoFar = Math.toIntExact(totalCandiesSoFar / k);
            if (averageCandiesSoFar > lowestCandiesPileSoFar) {
                averageCandiesSoFar = lowestCandiesPileSoFar;
            }
            if (averageCandiesSoFar > maxAverageCandies) {
                maxAverageCandies = averageCandiesSoFar;
            }
        }

        return maxAverageCandies;
    }
}
