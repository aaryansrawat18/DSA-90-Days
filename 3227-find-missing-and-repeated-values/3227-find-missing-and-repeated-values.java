class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        // Step 1: Flatten 2D grid into ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] row : grid) {
            for (int val : row) {
                list.add(val);
            }
        }

        // Step 2: Cycle sort on ArrayList
        int i = 0;
        while (i < total) {
            int val = list.get(i);
            int correctIndex = val - 1;

            if (val != list.get(correctIndex)) {
                // Swap list[i] and list[correctIndex]
                int temp = list.get(i);
                list.set(i, list.get(correctIndex));
                list.set(correctIndex, temp);
            } else {
                i++;
            }
        }

        // Step 3: Find repeated and missing
        for (i = 0; i < total; i++) {
            if (list.get(i) != i + 1) {
                return new int[]{list.get(i), i + 1};  // {repeated, missing}
            }
        }

        return new int[]{-1, -1};  // If no error found (should not happen)
    }
}
