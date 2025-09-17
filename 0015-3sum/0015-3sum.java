class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

       
        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<arr.length-2;i++){
             int left=i+1;
        int right =arr.length-1;

        while(left<right){

            int sum= arr[left]+arr[right]+arr[i];
            if(sum==0){

                set.add(Arrays.asList(arr[i],arr[left],arr[right]));
                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }

        }

        }

return new ArrayList<>(set);
        
    }
}