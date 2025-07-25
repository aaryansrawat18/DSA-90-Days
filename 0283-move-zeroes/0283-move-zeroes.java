import java.util.*;

class Solution {
    public void moveZeroes(int[] arr) {
        List<Integer> list = new ArrayList<>();

        // Step 1: Store non-zero elements in list
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        // Step 2: Copy elements back to array
        for (int i = 0; i < arr.length; i++) {
            if (i < list.size()) {
                arr[i] = list.get(i); // copy non-zero
            } else {
                arr[i] = 0; // fill remaining with zero
            }
        }
    }
}
