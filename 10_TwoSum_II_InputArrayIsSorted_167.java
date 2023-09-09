class TwoSum_II_InputArrayIsSorted_167 {

  public static int twoSum(int[] numbers, int target) {
    int start = 0;
    int end = numbers.length - 1;
    int arr1[] = new int[2];
    while (start < end) {
      if (numbers[start] + numbers[end] > target) {
        end--;
      } else if (numbers[start] + numbers[end] < target) {
        start++;
      } else {
        // +1 because our output index start from 1.
        arr1[0] = start;
        arr1[1] = end;
      }
    } //End while
    return 0; //Return empty array
  } //End twoSum

  public static void main(String[] args) {
    int arr[] = new int[10];
    arr[0] = 4;
    arr[1] = 5;
    arr[2] = 4;
    arr[3] = 5;
    int target = 9;

    System.out.println(twoSum(arr, target));
  } //End main
} //End Solution
