class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int maxsum=Integer.MIN_VALUE;
      int n= arr.length;
      int count=0;
      for(int i=0;i<n-k+1;i++){
        int sum=0;
        for(int j=i;j<i+k;j++){
            sum=sum+arr[j];
        }
        if((sum/k)>=(threshold)){ count++;}

      }
      return count;

    }
}