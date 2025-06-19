import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ele : nums) {
            pq.add(ele);
            if (pq.size() > nums.length) {
                ans.add(pq.remove());
            }
        }

        while (pq.size()>0) {
            ans.add(pq.remove());
        }

        // Convert List<Integer> to int[]
        int[] array = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            array[i] = ans.get(i);
        }

        return array;
    }
}
