// in it we have given the price of the stocks and we have to calculate the max profit by checking on which day we should by the stock and sell on which da
import java.util.*;
public class stocksProblem {
    public static int buyAndSellStocks(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i<prices.length; i++)
        {
            if(buyPrice <prices[i])
            {
                int profit = prices[i]- buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
    
}
