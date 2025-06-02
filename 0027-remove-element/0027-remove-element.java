class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Index to place the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move non-val element to the front
                k++;
            }
        }
        return k; // New length after removal
    }
}
