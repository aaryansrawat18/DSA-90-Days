class Solution {
    public int maxFrequencyElements(int[] arr) {
        int n = arr.length;
        int maxFreq = 0;

        // Step 1: Find maximum frequency
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        // Step 2: Count all elements with that maximum frequency
        int count = 0;
        boolean[] visited = new boolean[n]; // To avoid counting duplicates

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            if (freq == maxFreq) {
                count += freq;
            }

            // Mark all duplicates as visited
            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k]) {
                    visited[k] = true;
                }
            }
        }

        return count;
    }
}
