class Solution {
    public int maxProduct(int[] nums) {
    int maxp= Integer.MIN_VALUE;
    int n= nums.length;
    for(int i=0;i<n;i++){
        int pro=1;
        for(int j=i;j<n;j++){
            pro= pro*nums[j];
            if(pro>maxp){
                maxp=pro;
            }


        }
    }
    return maxp;
    }
}