/**
* @see <a href="https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75">Merge Strings Alternatively</a>
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        while (index < word1.length() && index < word2.length()) {
            sb.append(word1.charAt(index));
            sb.append(word2.charAt(index));

            index++;
        }

        if (index < word1.length()) {
            sb.append(word1.substring(index));
        } else if (index < word2.length()) {
            sb.append(word2.substring(index));
        }

        return sb.toString();
    }
}