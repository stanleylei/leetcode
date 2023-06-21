/**
 * @see <a href="https://leetcode.com/problems/subsets/description/?envType=study-plan-v2&envId=top-100-liked">Subsets</a>
 */

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        dfs(nums, res, 0, new ArrayList<Integer>());

        return res;
    }

    void dfs(int[] nums, List<List<Integer>> res, int startIndex, List<Integer> currentRes) {
        res.add(new ArrayList<>(currentRes));

        for (int i = startIndex; i < nums.length; i++) {
            currentRes.add(nums[i]);
            dfs(nums, res, i + 1, currentRes);
            currentRes.remove(currentRes.size() - 1);
        }
    }
}