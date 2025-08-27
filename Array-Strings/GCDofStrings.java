/*
 *  1071. Greatest Common Divisor of Strings
 *  Link: https://leetcode.com/problems/greatest-common-divisor-of-strings?envType=study-plan-v2&envId=leetcode-75
 *  Problem:
 *  Given two strings str1 and str2, return the largest string that can divide both str1 and str2.
 *  If no such string exists, return an empty string "".
 * 
 *  Approach / Idea:
 *  1. Check if concatenating str1 + str2 equals str2 + str1. 
 *     - If not equal, no common divisor exists, return "".
 *  2. If equal, compute the GCD of the lengths of str1 and str2.
 *  3. Return the substring of str1 from index 0 to gcd(length of str1, length of str2).
 * 
 *  Complexity Analysis:
 *  Time Complexity: O(n + m) — Concatenation and GCD computation are linear in the lengths of the strings.
 *  Space Complexity: O(1) — Ignoring the space for input and output strings; only variables are used.
 */
public class GCDofStrings {

    // Function to find the greatest common divisor string
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings are equal, otherwise return empty
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        // Compute GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return substring from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper function to compute GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Main method to test the solution
    public static void main(String[] args) {
        GCDofStrings solution = new GCDofStrings();
        
        // Test case 1
        String str1 = "ABAB";
        String str2 = "AB";
        System.out.println("GCD String: " + solution.gcdOfStrings(str1, str2)); // Output: AB

        // Test case 2
        String str3 = "ABCABC";
        String str4 = "ABC";
        System.out.println("GCD String: " + solution.gcdOfStrings(str3, str4)); // Output: ABC

        // Test case 3
        String str5 = "LEET";
        String str6 = "CODE";
        System.out.println("GCD String: " + solution.gcdOfStrings(str5, str6)); // Output: ""
    }
}
