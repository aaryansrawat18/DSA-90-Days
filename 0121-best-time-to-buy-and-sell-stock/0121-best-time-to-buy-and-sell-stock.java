class Solution {
    public int maxProfit(int[] arr) {
     int maxp= Integer.MIN_VALUE;
     int sofar= arr[0];
     for(int i=0;i<arr.length;i++){
        sofar=Math.min(sofar,arr[i]);
        int profit= arr[i]-sofar;
        maxp= Math.max(maxp, profit);
     }
     return maxp;
    }
}