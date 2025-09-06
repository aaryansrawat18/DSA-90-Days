class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        boolean firstRow = false, firstCol = false;

        // Step 1: check if first row/col should be zero
        for(int j=0;j<m;j++) if(arr[0][j]==0) firstRow = true;
        for(int i=0;i<n;i++) if(arr[i][0]==0) firstCol = true;

        // Step 2: mark rows and cols using first row/col
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        // Step 3: set zeros except first row/col
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }

        // Step 4: handle first row/col separately
        if(firstRow){
            for(int j=0;j<m;j++) arr[0][j]=0;
        }
        if(firstCol){
            for(int i=0;i<n;i++) arr[i][0]=0;
        }
    }
}
