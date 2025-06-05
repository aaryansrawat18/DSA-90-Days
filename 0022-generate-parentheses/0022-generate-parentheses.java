class Solution {
    public void print(int open, int close, int n, String s, List<String> result) {
        if (s.length() == 2 * n) {
            result.add(s);  // Store the valid combination
            return;
        }
        if (open < n) {
            print(open + 1, close, n, s + "(", result);
        }
        if (close < open) {
            print(open, close + 1, n, s + ")", result);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        print(0, 0, n, "", result);  // Start the recursion
        return result;
    }
}
