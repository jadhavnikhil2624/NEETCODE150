import java.util.*;

class Solution {

  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
        sb.append(s.charAt(i));
      } //End if
    } //End for

    int n = sb.length() - 1;

    for (int i = 0; i < sb.length() / 2; i++) {
      if (sb.charAt(i) != sb.charAt(n - i)) {
        return false;
      } //End if
    } //End for

    return true;
  } //End isPalidrome
} //End Class
