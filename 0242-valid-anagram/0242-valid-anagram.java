class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arr = s.toCharArray();
        char[] num = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(num);

        return Arrays.equals(arr, num);
    }
}