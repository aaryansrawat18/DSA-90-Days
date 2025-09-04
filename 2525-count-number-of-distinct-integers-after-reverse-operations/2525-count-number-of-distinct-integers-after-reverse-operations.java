class Solution {
    public static int rev(int num){
        String a= String.valueOf(num);
        String sb = new StringBuilder(a).reverse().toString();
        int reversedNum = Integer.parseInt(sb);
        return reversedNum ;

    }
    public int countDistinctIntegers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
            set.add(rev(arr[i]));
        }
        System.out.print(set);

        return set.size();
        
    }
}