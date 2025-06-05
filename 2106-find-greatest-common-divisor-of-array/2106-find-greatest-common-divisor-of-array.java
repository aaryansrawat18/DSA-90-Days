class Solution {
    public int findGCD(int[] arr) {
        int n = arr.length;

        // Step 1: Find min and max in the array
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        // Step 2: Brute-force: check every number from 1 to min
        int hcf = 1;
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }
}
