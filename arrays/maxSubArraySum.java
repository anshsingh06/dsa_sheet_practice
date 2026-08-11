package arrays;
import java.util.*;
public class maxSubArraySum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            currSum += arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum= Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);

    }
    
}
