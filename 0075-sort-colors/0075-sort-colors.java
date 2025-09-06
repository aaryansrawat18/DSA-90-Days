class Solution {
    public void swap(int[] arr, int i , int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] arr) {
        int n=arr.length;
        int low=0;
        int mid =0;
        int high =n-1;
       while(mid<=high){

        if(arr[mid]==0){
            swap(arr,low,mid);
            low++;
            mid++;

                        }
        else if (arr[mid]==1){
            mid++;
        }
        else{
            swap(arr,mid,high);
            high--;
           
        }
       }


        
    }
}