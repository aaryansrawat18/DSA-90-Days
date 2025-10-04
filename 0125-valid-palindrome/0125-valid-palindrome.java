class Solution {
    
    public boolean isPalindrome(String s) {
        
       StringBuilder sb = new StringBuilder();

        // 1. Build a cleaned string (lowercase + alphanumeric only)
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        // 2. Get reversed string
        String cleaned = sb.toString();
        String reversed = sb.reverse().toString();

        // 3. Compare cleaned string with reversed string
        return cleaned.equals(reversed);
    }
}