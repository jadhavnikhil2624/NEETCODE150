import java.util.*;

class Solution {

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> h = new HashSet<>();
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (h.contains(nums[i])) {
        count = 1;
      } else {
        h.add(nums[i]);
      }
    } //End for
    if (count == 1) {
      return true;
    }
    return false;
  }
}
