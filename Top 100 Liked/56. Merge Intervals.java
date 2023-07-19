/**
 * @see <a href="https://leetcode.com/problems/merge-intervals/description/?envType=study-plan-v2&envId=top-100-liked">Merge Intervals</a>
 */

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];
        List<int[]> res = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (currentEnd >= intervals[i][0]) {
                currentEnd = Math.max(intervals[i][1], currentEnd);
                continue;
            } else {
                res.add(new int[]{currentStart, currentEnd});
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }

        res.add(new int[]{currentStart, currentEnd});

        return res.toArray(new int[res.size()][]);
    }
}