class Solution {
    public void rotate(int[][] arr) {
        
           //transpose:
         for(int i=0;i<arr.length;i++){
         for(int j=0;j<i;j++){
             int temp= arr[i][j];
             arr[i][j]=arr[j][i];
             arr[j][i]=temp;
         }
     }
     int n= arr.length;
     //each row reverse:
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<n/2;j++){
             int temp= arr[i][j];
             arr[i][j]=arr[i][n-1-j];
             arr[i][n-1-j]=temp;
         }
     }
      
    }
}