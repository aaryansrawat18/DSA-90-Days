class Solution {
    public int[] productExceptSelf(int[] arr) {
      int n= arr.length;
      int[] pre= new int[n];
      pre[0]=1;

      //prefix:
      for(int i=1;i<n;i++){
        pre[i]=pre[i-1]*arr[i-1];
      }

      int[] suf= new int[n];
      suf[n-1]= 1;
      for(int i=n-2;i>=0;i--){
        suf[i]=suf[i+1]*arr[i+1];
      }

      int[] ans= new int[n];
       for(int i=0;i<n;i++){
        ans[i]=suf[i]*pre[i];
      }
      return ans;
     
    }
}