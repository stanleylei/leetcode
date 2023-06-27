/**
 * @see <a href="https://leetcode.com/problems/group-anagrams/description/?envType=study-plan-v2&envId=top-100-liked">Group Anagrams</a>
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.get(key) == null) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            } else {
                map.get(key).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}