/**
 * @see <a href="https://leetcode.com/problems/find-the-highest-altitude/description/">Find the Highest Altitude</a>
 */

class Solution {
    public int largestAltitude(int[] gain) {
        int largestAltitude = Integer.MIN_VALUE;
        int start = 0;

        for (int current : gain) {
            start += current;
            largestAltitude = Math.max(Math.max(largestAltitude, start), 0);
        }

        return largestAltitude;
    }
}