public class Stock {
    public static void main(String[] args) {

        int[] arr = { 7, 1, 5, 0, 6, 4 };

        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int buy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
