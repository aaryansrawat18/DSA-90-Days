class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n;

        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);

            // If char is repeated and its index is inside the current window
            if (map.containsKey(ch) && map.get(ch) >= i) {
                i = map.get(ch) + 1; // move i after the repeated character
            }

            map.put(ch, j); // update latest index of ch
            maxlen = Math.max(maxlen, j - i + 1); // update max length
        }

        return maxlen;
    }
}
