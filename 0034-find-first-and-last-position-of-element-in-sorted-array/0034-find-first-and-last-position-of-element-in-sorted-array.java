class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = -1, right = -1;
        int n = nums.length;

        // find first occurrence from left
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                left = i;
                break;
            }
        }

        // find last occurrence from right
        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] == target) {
                right = j;
                break;
            }
        }

        return new int[]{left, right};
    }
}