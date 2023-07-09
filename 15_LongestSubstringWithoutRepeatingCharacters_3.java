import java.util.*;

class Solution {

  public int lengthOfLongestSubstring(String s) {
    int left = 0, right = 0;
    Set<Character> hs = new HashSet<>();
    int max_length = 0;
    while (right < s.length()) {
      char c = s.charAt(right);
      if (hs.add(c)) {
        max_length = Math.max(max_length, right - left + 1);
        right++;
      } else {
        while (s.charAt(left) != c) {
          hs.remove(s.charAt(left));
          left++;
        } //End while
        hs.remove(c);
        left++;
      } //End if-else
    } //End while

    return max_length;
  } //End function
} //End class
