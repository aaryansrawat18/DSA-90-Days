class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new TreeSet<>();

        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; // Hundreds place cannot be 0

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {
                        result.add(num);
                    }
                }
            }
        }

        // Convert set to array
        int[] ans = new int[result.size()];
        int idx = 0;
        for (int val : result) {
            ans[idx++] = val;
        }

        return ans;
    }
}