/*
 * https://www.youtube.com/watch?v=1pkOgXD63yU&ab_channel=NeetCode
 * 
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */

public class SellStockSlideWindow {
  public int maxProfit(int[] prices) {
    // left: buy
    // right: sell
    // if r < l, l++, r++
    // if r > l, check with max profit and r++
    int l = 0;
    int r = 1;
    int maxProfit = 0;

    while (r < prices.length) {
      if (prices[r] > prices[l]) {
        int profit = prices[r] - prices[l];
        maxProfit = Math.max(maxProfit, profit);
      } else {
        l = r;
      }
      r++;
    }

    return maxProfit;
  }
}
