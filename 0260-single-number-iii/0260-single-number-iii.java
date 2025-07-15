class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        // Step 1: XOR all numbers to get xor = a ^ b (a, b are unique)
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find rightmost set bit in xor (differs a and b)
        int diffBit = xor & (-xor); // isolate rightmost set bit

        int a = 0, b = 0;

        // Step 3: Divide numbers into two groups based on diffBit
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                a ^= num;  // group 1
            } else {
                b ^= num;  // group 2
            }
        }

        return new int[]{a, b}; // two unique numbers
    }
}
