class Solution {
    public int triangularSum(int[] nums) {
        while (nums.length > 1) {
            int[] temp = new int[nums.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = temp;  // reduce to next row
        }
        return nums[0];  // final single element
    }
}
