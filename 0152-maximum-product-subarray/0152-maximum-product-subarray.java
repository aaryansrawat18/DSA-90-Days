class Solution {
    public int maxProduct(int[] arr) {
        int n= arr.length;
    
        int left=1;
        int right =1;
        int ans= arr[0];
        for(int i=0;i<n;i++){
            if(left==0) { left=1;}
            if(right==0){right=1;}

            left= left*arr[i];
            right= right*arr[n-1-i];

            ans= Math.max(ans, Math.max(left,right));


        }
        return ans;
    }
}