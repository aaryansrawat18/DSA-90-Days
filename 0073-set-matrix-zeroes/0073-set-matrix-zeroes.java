class Solution {
    public void setZeroes(int[][] arr) {
        int n= arr.length;
        int m=arr[0].length;

    boolean[] row= new boolean[n];
    boolean[] col= new boolean[m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==0){
                row[i] =true;
                col[j]= true;
            }
        }
    }
        
 for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]||col[j]){
               arr[i][j]=0;
            }
        }
    }
        




        
    }
}