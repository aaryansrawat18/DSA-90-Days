class Solution {
    public int minBitFlips(int start, int goal) {
        String first = Integer.toBinaryString(start);
        String second = Integer.toBinaryString(goal);

        // Pad shorter binary string with leading 0s
        int maxLen = Math.max(first.length(), second.length());
        while (first.length() < maxLen) {
            first = "0" + first;
        }
        while (second.length() < maxLen) {
            second = "0" + second;
        }

        int count = 0;

        // Compare each bit
        for (int i = 0; i < maxLen; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
