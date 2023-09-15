import java.util.*;

class Solution {

  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int n = temperatures.length;
    int arr[] = new int[n];

    for (int i = n - 1; i >= 0; i--) {
      while (
        !stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]
      ) {
        stack.pop();
      } //End whille

      if (!stack.isEmpty()) {
        arr[i] = stack.peek() - i;
      } //End if

      stack.push(i);
    } //End for
    return arr;
  } //End main
} //End class
