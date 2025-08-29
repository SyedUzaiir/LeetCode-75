/*
 * 345. Reverse Vowels of a String
 * Link: https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
 * Approach / Idea:
 * 1. Use two pointers (`low` at start, `high` at end) to scan the string.
 * 2. If both characters at `low` and `high` are vowels, swap them and move both pointers.
 * 3. If the left character is not a vowel, move `low++`.
 * 4. If the right character is not a vowel, move `high--`.
 * 5. Continue until pointers meet, then return the modified string.
 * 
 * Example Walkthrough:
 * Input: "hello"
 * Step 1: low=0(h), high=4(o) → swap → "oellh"
 * Step 2: low=1(e), high=3(l) → skip high
 * Step 3: low=1(e), high=2(l) → skip high
 * Step 4: low >= high → stop → final result: "holle"
 * 
 * Complexity Analysis:
 * Time Complexity: O(n) → We traverse the string at most once.
 * Space Complexity: O(n) → For storing the character array (mutable string).
 */

public class ReverseVowelsOfaString {
    
    // Utility method to check if a character is a vowel
    public boolean isVowel(char c) {
        switch (c) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                return true;
            default:
                return false;
        }
    }

    public String reverseVowels(String s) {
        int low = 0;
        int high = s.length() - 1;
        char[] chars = s.toCharArray();

        while (low < high) {
            if (isVowel(chars[low]) && isVowel(chars[high])) {
                // Swap vowels
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
                low++;
                high--;
            } else if (!isVowel(chars[low])) {
                low++;
            } else {
                high--;
            }
        }

        return new String(chars);
    }

    // Main function for testing
    public static void main(String[] args) {
        ReverseVowelsOfaString solution = new ReverseVowelsOfaString();

        String s1 = "hello";
        String s2 = "leetcode";

        // Expected: "holle"
        System.out.println(solution.reverseVowels(s1));

        // Expected: "leotcede"
        System.out.println(solution.reverseVowels(s2));
    }
}
