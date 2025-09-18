class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
          Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
             int left=j+1;
        int right =arr.length-1;
        while(left<right){
             long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
            if(sum==target){

                set.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        }
        }
return new ArrayList<>(set); 
        
    }
}