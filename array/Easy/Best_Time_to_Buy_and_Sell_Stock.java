package Easy;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else if(prices[i]-buy>profit){
                profit=prices[i]-buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        Best_Time_to_Buy_and_Sell_Stock sc=new Best_Time_to_Buy_and_Sell_Stock();
        System.out.println(sc.maxProfit(arr));
    }
}
