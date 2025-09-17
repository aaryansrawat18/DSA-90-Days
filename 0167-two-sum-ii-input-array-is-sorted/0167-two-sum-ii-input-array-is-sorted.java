class Solution {
    public int[] twoSum(int[] arr, int target) {
HashMap<Integer, Integer> map = new HashMap<>(); for (int i = 0; i < arr.length; i++) { int main = target - arr[i]; if (map.containsKey(main)) { return new int[]{map.get(main)+1, i+1}; } map.put(arr[i], i); } return new int[]{};
        
    }
}
