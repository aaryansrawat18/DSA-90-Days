

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Step 1: Create a new empty list to store all elements from the array
        List<Integer> numberList = new ArrayList<>();

        // Step 2: Copy all elements from the array into the list
        for (int number : arr) {
            numberList.add(number);  // adding numbers one by one into the list
        }

        /*
         Step 3: Sort the list using a custom rule.
         We use a "lambda function" which is like a mini-rule to decide which number comes first.

         The rule is:
         - The number which is closer to x should come first.
         - If two numbers are equally close to x, then the smaller number comes first.
        */
        numberList.sort((a, b) -> {
            int distanceA = Math.abs(a - x);  // how far a is from x
            int distanceB = Math.abs(b - x);  // how far b is from x

            if (distanceA == distanceB) {
                // If both numbers are equally far from x,
                // then we keep the smaller number first
                return Integer.compare(a, b);
            }

            // Otherwise, the one with the smaller distance comes first
            return Integer.compare(distanceA, distanceB);
        });

        // Step 4: Take only the first k numbers from the sorted list
        List<Integer> resultList = numberList.subList(0, k);

        // Step 5: The result should be sorted in ascending order, so we sort again
        Collections.sort(resultList);  // this sorts the final list from small to big

        // Step 6: Return the final list
        return resultList;
    }
}
