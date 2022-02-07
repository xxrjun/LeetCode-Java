public class E121_BestTimetoButandSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minValue = prices[0];
        int maxProfit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            }
            if(prices[i] - minValue > maxProfit){
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;

    }
}
