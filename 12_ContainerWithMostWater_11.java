import java.util.*;

class Solution {

  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int max = 0;

    while (left < right) {
      int lh = height[left];
      int rh = height[right];
      int min_height = Math.min(lh, rh);
      int length = right - left;
      int current_area = min_height * length;

      max = Math.max(max, current_area);
      if (lh < rh) {
        left++;
      } else {
        right--;
      } //End if-else
    } //End while

    return max;
  } //End maxArea
} //End class
