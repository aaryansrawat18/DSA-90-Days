class Solution {
    public int findDuplicate(int[] nums) {
     Set<Integer> set = new HashSet<>();
for (int num : nums) {
    if (set.contains(num)) {
        return num; // duplicate found
    }
    set.add(num);
}
return 0;
    }
}