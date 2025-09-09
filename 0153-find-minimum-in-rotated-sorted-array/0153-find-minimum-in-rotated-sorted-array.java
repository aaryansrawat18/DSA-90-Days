class Solution {
    public int findMin(int[] nums) {
        int n= Arrays.stream(nums).min().getAsInt();
        return n;
        
    }
}