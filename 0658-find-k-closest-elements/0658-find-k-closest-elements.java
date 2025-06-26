

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        
        List<Integer> numberList = new ArrayList<>();

        
        for (int number : arr) {
            numberList.add(number);  // adding numbers one by one into the list
        }

      
        numberList.sort((a, b) -> {
            int distanceA = Math.abs(a - x);  // how far a is from x
            int distanceB = Math.abs(b - x);  // how far b is from x

            if (distanceA == distanceB) {
                
                return Integer.compare(a, b);
            }

            
            return Integer.compare(distanceA, distanceB);
        });

        List<Integer> resultlist= numberList.subList(0,k);
        Collections.sort(resultlist);
        return resultlist;
        
    }
}
