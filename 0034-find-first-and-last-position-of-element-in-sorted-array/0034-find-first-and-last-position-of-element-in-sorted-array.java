class Solution {
    public int[] searchRange(int[] nums, int target) {
    int left=0;
    int right =nums.length-1;
    int start=-1;
    int end= -1;
    for(int i=0;i<nums.length;i++){
       if(nums[left]==target){
        start= left;
        break;
       }
       else{
        left++;
       }
    }

    for(int i=0;i<nums.length;i++){
       if(nums[right]==target){
        end= right;
        break;
       }
       else{
        right--;
       }
    }
    
 
 if(left==-1 || right==-1) return new int[]{-1,-1};

 int[] ans={left,right};

 return ans;
        
    }
}