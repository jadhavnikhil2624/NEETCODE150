import java.util.*;

class Solution {

  public int[] twoSum(int[] nums, int target) {
    int result[] = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        result[0] = i;
        result[1] = map.get(target - nums[i]);
        return result;
      } //End if
      map.put(nums[i], i);
    } //End for
    return result;
  } //End main
} //end solution
