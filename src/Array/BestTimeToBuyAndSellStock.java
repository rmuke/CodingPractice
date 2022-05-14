package Array;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices){

        int maxProfit = 0,maxProfitSoFar = 0;

        for(int i=1;i<prices.length;i++){

            maxProfit = Math.max(0,maxProfit+=prices[i]-prices[i-1]);
            maxProfitSoFar = Math.max(maxProfitSoFar,maxProfit);
        }
        return maxProfitSoFar;
    }
}
