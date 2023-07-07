import java.util.*;

class Solution {

  List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums); //Sorting the array first

    for (int i = 0; i < nums.length; i++) {
      if (i == 0 || nums[i - 1] != nums[i]) { //Avoid duplicancy of 'a'
        //Call the Function here
        twoSumSorted(i + 1, nums.length - 1, nums, 0 - nums[i]);
      } //End if
    } //End for
    return result;
  } //end threeSum

  //Create function for getting addition of two numbers (TwoSum) b+c = 0-1 (target)

  // int i=b,int j=c,int target=b+c=0-a;
  void twoSumSorted(int i, int j, int[] nums, int target) {
    int a = nums[i - 1];

    while (i < j) {
      if (nums[i] + nums[j] > target) {
        j--;
      } else if (nums[i] + nums[j] < target) {
        i++;
      } else {
        List<Integer> list = new ArrayList<>();
        //If all conditions are failed, then this are a+b+c=0 pairs list , so we add them
        list.add(a);
        list.add(nums[i]);
        list.add(nums[j]);

        result.add(list); //Adding list into our Final List

        //Then check for duplicate b
        while (i < j && nums[i] == nums[i + 1]) {
          i++;
        } //End while for b

        //Then check for duplicate c
        while (i < j && nums[j] == nums[j - 1]) {
          j--;
        } //End while for c

        //To Get multiple list, we have move the pointers
        i++;
        j--;
      } //End if-else ladder
    } //End while
  } //End twoSumSorted
} //End Solution
