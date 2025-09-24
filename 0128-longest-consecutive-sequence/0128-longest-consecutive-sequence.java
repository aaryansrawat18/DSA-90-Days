class Solution {
    public int longestConsecutive(int[] nums) {
      
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int length = 0;

        for (int num : set) {
            // Only start counting if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    count++;
                }
                length = Math.max(length, count);
            }
        }

        return length;
    
    }
}