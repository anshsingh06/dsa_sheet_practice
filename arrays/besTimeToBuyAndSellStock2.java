package arrays;
import java.util.*;
public class besTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int profit = 0;
        for(int i=0;i<n-1;i++){
            if(prices[i]< prices[i+1]){ 
               profit += prices[i+1]- prices[i];

            }
        }
        System.out.println(profit);
    }
           
}
