/*
 *  1768. Merge Strings Alternately
 *  Link:https://leetcode.com/problems/merge-strings-alternately/description/
    Approach / Idea:

    1.Find the lengths of both strings.
    2.Use a loop up to the length of the longer string.
    3.Append characters from word1 and word2 if the index is within bounds.
    4.Return the merged string.

    Complexity Analysis:

    Time Complexity: O(n + m) — Loop runs for the length of the longer string.
    Space complexity: O(1)
    Without considering the space consumed by the input strings (word1 and word2) and the output string (result), we do not use more than constant space.
 */

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder result = new StringBuilder();
        int max = n > m ? n : m;
        for (int i = 0; i < max; i++) {
            if (i < n) {
                result.append(word1.charAt(i));
            }
            if (i < m) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        MergeStringsAlternately solution = new MergeStringsAlternately();
        
        String word1 = "abc";
        String word2 = "pqr";
        
        String merged = solution.mergeAlternately(word1, word2);
        System.out.println("Merged String: " + merged);
        
        // Another test case
        String word3 = "ab";
        String word4 = "pqrs";
        System.out.println("Merged String: " + solution.mergeAlternately(word3, word4));
    }
}
