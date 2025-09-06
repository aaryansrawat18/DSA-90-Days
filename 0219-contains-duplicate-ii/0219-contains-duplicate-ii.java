class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Step 1: check duplicate
            if (set.contains(nums[i])) {
                return true;
            }

            // Step 2: add current element
            set.add(nums[i]);

            // Step 3: maintain window size
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}