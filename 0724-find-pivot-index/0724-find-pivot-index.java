class Solution {
    public int pivotIndex(int[] arr) {
        int n= arr.length;
         for(int i=0;i<n;i++){
            int leftsum=0;
            int rightsum=0;

            for(int j=0;j<i;j++){
                leftsum= leftsum+arr[j];
            }
            
            for(int j=i+1;j<n;j++){
                rightsum=  rightsum+arr[j];
            }

            if(leftsum== rightsum) return i;
           


         }
         

      return -1;
        
    }
}