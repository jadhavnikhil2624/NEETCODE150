class Solution {

  public int maxProfit(int[] prices) {
    int left = 0;
    int right = 1;
    int profit = 0;
    int totalProfit = 0;

    while (right < prices.length) {
      if (prices[left] > prices[right]) {
        left++;
      } else {
        profit = prices[right] - prices[left];
        if (profit > totalProfit) {
          totalProfit = profit;
        }
        right++;
      } //End if-else
    } //End while

    return totalProfit;
  } //End maxProfit
} //End Solution
