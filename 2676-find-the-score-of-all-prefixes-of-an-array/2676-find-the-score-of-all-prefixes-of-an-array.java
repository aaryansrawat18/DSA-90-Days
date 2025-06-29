class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] answer = new long[n];
        
        int maxSoFar = Integer.MIN_VALUE;
        long total = 0;

        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);
            int newValue = nums[i] + maxSoFar;  // add current value + max so far
            total += newValue;                  // keep adding to get prefix sum
            answer[i] = total;                  // store in answer array
        }

        return answer;
    }
}
