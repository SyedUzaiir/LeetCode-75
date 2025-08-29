/*
 * 605. Can Place Flowers
 * Link: https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
 * Approach / Idea:
 * 1. Traverse the flowerbed array.
 * 2. For each empty plot (0), check its left and right neighbors:
 *    - Left is empty (or out of bounds).
 *    - Right is empty (or out of bounds).
 * 3. If both neighbors are empty, place a flower (set to 1) and increment count.
 * 4. After the loop, return true if count >= n, otherwise false.
 * 
 * Complexity Analysis:
 * Time Complexity: O(n) → Single pass through the flowerbed array.
 * Space Complexity: O(1) → Constant extra space used.
 */

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check left and right plots
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both are empty, place a flower here
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Place flower
                    count++;
                }
            }
        }

        return count >= n;
    }

    // Main function for testing
    public static void main(String[] args) {
        CanPlaceFlowers solution = new CanPlaceFlowers();

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        // Expected Output: true
        System.out.println(solution.canPlaceFlowers(flowerbed1, n1));

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        // Expected Output: false
        System.out.println(solution.canPlaceFlowers(flowerbed2, n2));
    }
}
