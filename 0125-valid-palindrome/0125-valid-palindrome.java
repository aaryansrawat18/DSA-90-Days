class Solution {
    
    public boolean isPalindrome(String s) {
        
           s = s.toLowerCase();
          String clean= s.replaceAll("[^a-z0-9]", "");
            String reversed = new StringBuilder(clean).reverse().toString();

      return clean.equals(reversed);
    }
}


   