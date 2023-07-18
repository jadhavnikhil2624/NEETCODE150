import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart=0, maxLength=0,maxRepeatLetterCount=0;
        int [] letterFrequancyMap = new int[26];

        for(int i=0;i<s.length();i++){
            char rightChar = s.charAt(i);
            letterFrequancyMap[rightChar-'A'] = letterFrequancyMap[rightChar-'A']+1;
            maxRepeatLetterCount = Math.max(letterFrequancyMap[rightChar-'A'],maxRepeatLetterCount);

            if(i-windowStart+1 -maxRepeatLetterCount >k){
                char leftChar = s.charAt(windowStart);
                letterFrequancyMap[leftChar-'A']= letterFrequancyMap[leftChar-'A']-1;
                windowStart++;
            }//End if

            maxLength = Math.max(maxLength,i-windowStart+1);
        } //End for 

        return maxLength;
    }//End class
}//End solution