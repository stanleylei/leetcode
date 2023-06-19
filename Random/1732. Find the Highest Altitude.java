/**
 * @see <a href="https://leetcode.com/problems/find-the-highest-altitude/description/">Find the Highest Altitude</a>
 */

class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int largestAltitude = start;

        for (int current : gain) {
            start += current;
            largestAltitude = Math.max(largestAltitude, start);
        }

        return largestAltitude;
    }
}