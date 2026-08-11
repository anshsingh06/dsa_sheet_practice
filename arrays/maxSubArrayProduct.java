package arrays;
import java.util.*;
public class maxSubArrayProduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
       
        int prefix = 1;
        int suffix = 1;

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            // Prefix
            if (prefix == 0) {
                prefix = 1;
            }

            prefix = prefix * nums[i];

            // Suffix
            if (suffix == 0) {
                suffix = 1;
            }

            suffix = suffix * nums[n - 1 - i];

            answer = Math.max(answer,
                    Math.max(prefix, suffix));
        }
        System.out.println(answer);
    }
}
