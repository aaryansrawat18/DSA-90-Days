class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char key=s.charAt(i);
            if(smap.containsKey(key))
            {
                int freq=smap.get(key);
                smap.put(key,freq+1);

            }
            else
            {
                smap.put(key,1);
            }
        }
//1st end
 HashMap<Character, Integer> tmap= new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char key=t.charAt(i);
            if(tmap.containsKey(key))
            {
                int freq=tmap.get(key);
                tmap.put(key,freq+1);

            }
            else
            {
                tmap.put(key,1);
            }
        }

        if(smap.equals(tmap)) {return true;}
        else{

 return false;
        }

        //return
        
    }
}