

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        generate3DigitNumbers(digits, used, 0, 0, resultSet);

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        Arrays.sort(result); // Optional: return sorted output
        return result;
    }

    // Recursive method to form 3-digit numbers and check evenness
    private void generate3DigitNumbers(int[] digits, boolean[] used, int number, int depth, Set<Integer> result) {
        if (depth == 3) {
            if (number % 2 == 0 && number >= 100) {  // Must be 3-digit & even
                result.add(number);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (!used[i]) {
                used[i] = true;
                generate3DigitNumbers(digits, used, number * 10 + digits[i], depth + 1, result);
                used[i] = false;
            }
        }
    }
}
