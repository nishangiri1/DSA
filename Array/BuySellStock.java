package Array;

public class BuySellStock {
    public static int buyAndSellStock(int prices[])
    {
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++)
        {
            if(buyingPrice<prices[i])
            {
                int profit=prices[i]-buyingPrice ;
                maxProfit=Math.max(maxProfit,profit);
            }
            else
            {
                buyingPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Max profit the last wee is : "+buyAndSellStock(prices));
    }
}
