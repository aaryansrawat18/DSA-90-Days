class Solution {
    public int maxProfit(int[] arr) {
        int maxp=0;
        int minsofar=arr[0];
        for(int i=0;i<arr.length;i++){
            minsofar= Math.min(minsofar,arr[i]);
            int profit= arr[i]-minsofar;
            maxp=Math.max(maxp,profit);
        }
        return maxp;
    }
}