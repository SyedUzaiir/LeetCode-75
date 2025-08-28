/*
 * 1431. Kids With the Greatest Number of Candies
 * Link:https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
 * Approach / Idea:
 * 1. Find the maximum number of candies that any kid currently has.
 * 2. For each kid, check if candies[i] + extraCandies >= maxCandies.
 * 3. If true, add `true` to the result list; otherwise, add `false`.
 * 
 * Complexity Analysis:
 * Time Complexity: O(n) → One pass to find the max, one pass to check each kid.
 * Space Complexity: O(n) → Result list stores a boolean for each kid.
 */

import java.util.*;

public class KidWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int greatest = 0;

        // Step 1: Find the maximum candies among all kids
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }

        // Step 2: Check each kid if they can reach the max with extraCandies
        for (int i = 0; i < candies.length; i++) {
            int total = candies[i] + extraCandies;
            res.add(total >= greatest);
        }

        return res;
    }

    // Main function for testing
    public static void main(String[] args) {
        KidWithGreatestCandies solution = new KidWithGreatestCandies();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        // Expected Output: [true, true, true, false, true]
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }
}
