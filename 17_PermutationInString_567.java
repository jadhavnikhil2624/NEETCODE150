import java.util.*;

public class Solution {

  public boolean checkInclusion(String s1, String s2) {
    s1 = sortFunction(s1);

    for (int i = 0; i <= s2.length() - s1.length(); i++) {
      if (s1.equals(sortFunction(s2.substring(i, i + s1.length())))) {
        return true;
      } //End if
    } //End for
    return false;
  } //End checkInclusion

  public String sortFunction(String s) {
    char ch[] = s.toCharArray();
    Arrays.sort(ch);

    return new String(ch);
  } //End sortFunction
} //End Solution
