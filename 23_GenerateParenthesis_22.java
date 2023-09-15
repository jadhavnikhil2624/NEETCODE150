import java.util.*;

class Solution {

  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<>();
    findAll("(", 1, 0, list, n);
    return list;
  } //End generateParenthesis

  void findAll(String current, int open, int close, List<String> list, int n) {
    if (current.length() == n * 2) {
      list.add(current);
      return;
    } //End if

    if (open < n) findAll(current + "(", open + 1, close, list, n);
    if (close < open) findAll(current + ")", open, close + 1, list, n);
  } //End findAll
} //End class
