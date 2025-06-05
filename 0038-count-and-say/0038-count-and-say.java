class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";  // Base case

        String s = countAndSay(n - 1); // Recursive call
        String ans = "";  // Final answer string

        int i = 0;
        int j = 0;

        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int len = j - i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }

        // Handle the last group after the loop ends
        int len = j - i;
        ans += len;
        ans += s.charAt(i);

        return ans;
    }
}
