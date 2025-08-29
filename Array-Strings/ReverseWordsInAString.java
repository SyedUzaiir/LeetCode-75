/*
 *  151. Reverse Words in a String
 *  Link: https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 *  Solution link: https://leetcode.com/problems/reverse-words-in-a-string/solutions/7135348/reverse-words-in-a-string-classic-safe-c-3027
 *  Problem:
 *  Given an input string s, reverse the order of the words.
 *  A word is defined as a sequence of non-space characters. 
 *  The words in s will be separated by at least one space.
 *
 *  Example:
 *  Input:  "  the sky   is blue  "
 *  Output: "blue is sky the"
 *
 *  Approach / Idea:
 *  1. Trim the input string to remove leading and trailing spaces.
 *  2. Split the string by one or more spaces (regex "\\s+").
 *  3. Iterate over the words array in reverse order.
 *  4. Append words into a StringBuilder with spaces in between.
 *  5. Return the final reversed string.
 *
 *  Complexity Analysis:
 *  Time Complexity: O(n) — where n is the length of the string.
 *                   Traverses the string once for trimming, splitting, and rebuilding.
 *  Space Complexity: O(n) — for storing the split words and the output.
 *
 *  Tags: String, Simulation
 */

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();

        // Step 2: Split string into words using regex for one or more spaces
        String[] words = s.split("\\s+");

        // Step 3: Use StringBuilder to rebuild in reverse order
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        // Step 4: Return the final string
        return sb.toString();
    }

    // Main function for testing
    public static void main(String[] args) {
        ReverseWordsInAString solution = new ReverseWordsInAString();

        String input = "  the sky   is blue  ";
        String result = solution.reverseWords(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
        // Expected: "blue is sky the"
    }
}
