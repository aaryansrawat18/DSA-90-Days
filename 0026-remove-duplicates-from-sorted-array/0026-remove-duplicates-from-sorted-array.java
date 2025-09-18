class Solution {
    public int removeDuplicates(int[] nums) {
      if (nums.length == 0) return 0;

        int i = 0; // last unique element index

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;             // move index for next unique element
                nums[i] = nums[j]; // place the new unique element
            }
        }

        return i + 1; // k = number of unique elements

    }
}