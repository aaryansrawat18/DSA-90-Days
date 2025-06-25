class Solution {
    public int maxSubArray(int[] nums) {
   int minsum= nums[0];
   int currsum=nums[0];
   for(int i=1;i<nums.length;i++){
    currsum=Math.max(nums[i],currsum+nums[i]);
    minsum=Math.max(minsum,currsum);
   }
   return minsum;
    }
}