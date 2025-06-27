public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>();
        for (int stone : stones) {
            stoneList.add(stone);
        }

        while (stoneList.size() > 1) {
            // Step 1: Sort in descending order
            Collections.sort(stoneList, Collections.reverseOrder());

            // Step 2: Take top 2 heaviest stones
            int stone1 = stoneList.get(0);
            int stone2 = stoneList.get(1);

            // Step 3: Remove them
            stoneList.remove(0);
            stoneList.remove(0);

            // Step 4: Add the result of smash (if any)
            if (stone1 != stone2) {
                stoneList.add(stone1 - stone2);
            }
        }

        // Return the remaining stone or 0
        return stoneList.isEmpty() ? 0 : stoneList.get(0);
    }
}