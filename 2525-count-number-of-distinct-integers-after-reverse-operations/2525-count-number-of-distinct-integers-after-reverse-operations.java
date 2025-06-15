class Solution {
    public static int rev(int r){
    String rev = Integer.toString(r);
    StringBuilder sb = new StringBuilder(rev);
    sb.reverse(); // Reverse the string once
    String str = sb.toString(); // Convert StringBuilder to String
    int reverse = Integer.valueOf(str); // Convert String to int
    return reverse;
}
    public int countDistinctIntegers(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
for(int i =0;i<arr.length;i++){
    set.add(arr[i]);
    set.add(rev(arr[i]));
}
return set.size();
    }
}