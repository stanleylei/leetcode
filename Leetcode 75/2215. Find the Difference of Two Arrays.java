/**
 * @see <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75">Find the Difference of Two Arrays</a>
 */

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!set2.contains(nums1[i]) && !res1.contains(nums1[i])) {
                res1.add(nums1[i]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!set1.contains(nums2[i]) && !res2.contains(nums2[i])) {
                res2.add(nums2[i]);
            }
        }

        res.add(res1);
        res.add(res2);

        return res;
    }
}