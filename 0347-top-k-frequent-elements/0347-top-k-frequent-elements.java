public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency using simple if-else
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        // Step 2: Convert map to list of entries
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());

        // Step 3: Sort list in descending order of frequency
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Prepare result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}