class Solution {
    public int maxArea(int[] arr) {
        int n= arr.length;
        int left=0;
        int right=n-1;
        int maxarea=0;

        while(left<right){
            int area= (Math.min(arr[right],arr[left])) * (right-left);
        maxarea= Math.max(area, maxarea);
        if(arr[left]<arr[right]){
            left++;
        }
        else{
            right--;
        }



        }
      return maxarea;
    }
}