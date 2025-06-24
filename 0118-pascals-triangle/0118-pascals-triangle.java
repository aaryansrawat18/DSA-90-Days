class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
List<Integer> list = new ArrayList<>();
 for(int j=0;j<=i;j++){
    if(j==0 || i==j){
        list.add(1);
    }

    else{
        int val= ans.get(i-1).get(j-1)+ ans.get(i-1).get(j);
        list.add(val);
    }
 }
 ans.add(list);
        }
        return ans;

    }
}