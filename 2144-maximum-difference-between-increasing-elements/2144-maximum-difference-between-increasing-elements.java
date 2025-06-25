class Solution {
    public int maximumDifference(int[] a) {
         int maxProfit =0;
         int kase = -1;
        int minSoFar = a[0];

        for (int i = 0; i < a.length; i++) {
            minSoFar = Math.min(minSoFar, a[i]);
            int profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        if (maxProfit==0 ) return kase;

        return maxProfit; 
    }
}