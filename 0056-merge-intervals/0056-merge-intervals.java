class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> list = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];

            if (s <= end) {
                // Merge intervals
                end = Math.max(end, e);
            } else {
                // Add previous interval and update start & end
                list.add(new int[]{start, end});
                start = s;
                end = e;
            }
        }

        // Add the last interval
        list.add(new int[]{start, end});

        // Convert list to array
        return list.toArray(new int[list.size()][]);
    
        
    }
}