import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }//End if

        HashMap<Character,Integer> ch1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> ch2 = new HashMap<Character,Integer>();

        char []strArray1 = s.toCharArray();
        char []strArray2 = t.toCharArray();
        for(char c:strArray1){
            if(ch1.containsKey(c)){
                ch1.put(c,ch1.get(c)+1);
            }else{
                ch1.put(c,1);
            }
        }//end for 

        for(char c:strArray2){
            if(ch2.containsKey(c)){
                ch2.put(c,ch2.get(c)+1);
            }else{
                ch2.put(c,1);
            }//End if-else
        }//end for 

        if(ch1.equals(ch2)){
            return true;
        }
        return false;
    }//End isAnagram
}//End solution