class Solution {
  
    public int maximumNumberOfStringPairs(String[] arr) {
        HashSet<String> set= new HashSet<>();
        int count=0;
            // String rev = new StringBuilder(word).reverse().toString();
           for(int i=0;i<arr.length;i++){
             String rev= new StringBuilder(arr[i]).reverse().toString();
             if(set.contains(rev)){
                count++;
             }
             else{
                set.add(arr[i]);
             }
           }

        return count;
    }
}