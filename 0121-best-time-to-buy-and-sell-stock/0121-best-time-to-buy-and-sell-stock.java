class Solution {
    public int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]); // track minimum price
            int profit = arr[i] - minPrice;        // current profit
            maxProfit = Math.max(maxProfit, profit); // update maxProfit
        }

        return maxProfit;
    }
}
