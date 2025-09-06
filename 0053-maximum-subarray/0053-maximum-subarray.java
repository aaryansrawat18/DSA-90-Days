class Solution {
    public int maxSubArray(int[] a) {
        int maxsum=a[0];
    
        int currsum=a[0];
        for(int i=1;i<a.length;i++){
            currsum= Math.max(a[i],currsum+a[i]);
            maxsum= Math.max(maxsum, currsum);
        }
        return maxsum;
        
    }
}