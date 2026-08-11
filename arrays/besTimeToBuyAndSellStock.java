package arrays;
import java.util.*;
public class besTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit =0;
        for(int i=0;i<n;i++){
            if(prices[i]> buyPrice){ 
               profit = prices[i]- buyPrice;
               maxProfit = Math.max(profit, maxProfit);

            }
            else{
                buyPrice = prices[i];
            }
           


        }
        System.out.println(maxProfit);
    }
    
}
