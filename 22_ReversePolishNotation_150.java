import java.util.*; 

class Solution {

  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String token : tokens) {
      switch (token.charAt(0)) {
        case '+':
          int sum = stack.pop() + stack.pop();
          stack.push(sum);
          break;
        case '*':
          int product = stack.pop() * stack.pop();
          stack.push(product);
          break;
        case '/':
          int denominator = stack.pop();
          int numerator = stack.pop();
          stack.push(numerator / denominator);
          break;
        default: // '-' or negative
          if (token.charAt(0) == '-' && token.length() == 1) {
            int right = stack.pop();
            int left = stack.pop();
            stack.push(left - right);
          } else {
            stack.push(Integer.parseInt(token));
          } //End if-else
          break;
      } //End switch
    } //End for

    
    return stack.pop();
  } //End main
} //End class
