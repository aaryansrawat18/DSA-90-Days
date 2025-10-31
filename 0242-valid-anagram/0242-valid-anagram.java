class Solution {
    public boolean isAnagram(String s, String t) {
          char[] sArray = s.toCharArray();
                  char[] tArray = t.toCharArray();

        Arrays.sort( sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
        
    }
}