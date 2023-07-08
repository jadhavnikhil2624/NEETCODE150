import java.util.*;

class Solution {

  public int trap(int[] height) {
    int n = height.length;
    int rightMax = 0;
    int maxIndex = 0;
    int totalWater = 0;
    // here we first find the rightmost top building
    for (int i = 0; i < n; i++) {
      if (height[i] > rightMax) {
        rightMax = height[i];
        maxIndex = i;
      } //End if
    } //End for

    // part 1 we divide the problem in two parts for finding the leftmost building and rightmost building
    // from dividing part (maxIndex) -->|<--
    int leftMax = 0;

    for (int i = 0; i < maxIndex; i++) { // Finding -->| this part
      leftMax = Math.max(leftMax, height[i]);
      int water = Math.min(leftMax, rightMax) - height[i];
      totalWater += water;
    } //End for

    // part 2 now we find the |<--- part
    leftMax = 0;
    for (int i = n - 1; i > maxIndex; i--) {
      leftMax = Math.max(leftMax, height[i]);
      int water = Math.min(leftMax, rightMax) - height[i];
      totalWater += water;
    } //End for

    return totalWater;
  } //End trap
} //End solution
