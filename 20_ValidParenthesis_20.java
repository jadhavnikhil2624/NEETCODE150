import java.util.Stack;

class Solution {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '{') {
        stack.push('}');
      } else if (c == '[') {
        stack.push(']');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      } //End if-else
    } //End for
    return stack.isEmpty();
  } //End isValid
} //End class
