class Solution {
    //hello
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If duplicate, move left pointer until removed
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current char
            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
