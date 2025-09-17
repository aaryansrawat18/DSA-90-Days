class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left=0;
        int right= arr.length-1;
        for(int i=0;i<arr.length;i++){
            int sum =arr[left]+arr[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }

          else if(sum<target){
                left++;
            }
            else{
                right--;
            }


        }
        
        return new int[]{};
    }
}