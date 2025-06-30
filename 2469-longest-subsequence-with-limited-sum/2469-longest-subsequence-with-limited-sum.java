class Solution {
    public int length(int[] arr,int n)
    {
        int sum=0,i=0;
        for(i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>n)
            return i;
            sum+=arr[i];
        }
        return i;
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++)
        {
            int n=length(nums,queries[i]);
            queries[i]=n;
        }
        return queries;
    }
}