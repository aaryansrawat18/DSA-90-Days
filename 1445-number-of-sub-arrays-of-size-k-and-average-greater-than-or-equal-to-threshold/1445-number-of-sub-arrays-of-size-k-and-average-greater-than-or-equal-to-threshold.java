class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
     int i=0;
     int n=arr.length;
     int count=0;
     int j=k-1;
     int sum=0;
    for(int a=0;a<=k-1;a++){
        sum=sum+arr[a];
    }
     if (sum / k >= threshold) {
            count++;
        }
    i++; j++;

    while(j<n){
        sum=sum-arr[i-1]+arr[j];
        if((sum/k)>=threshold) count++;
         
        i++;j++;
       
    }
 return count;

    }
}