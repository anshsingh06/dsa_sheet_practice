package arrays;
import java.util.*;
public class zeroToEnd {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
         int a=0;
        for(int j=0;j<n;j++){
           
            if(nums[j] != 0){
            int temp = nums[j];
            nums[j]= nums[a];
            nums[a] = temp;
            a++;
            }
            
        }
        for(int i=0;i<n;i++){
        System.out.println(nums[i]);
        }
    }
}


