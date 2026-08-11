import java.util.*;

public class longestSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = new int[26];

        int left = 0;
        int maxCount = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            arr[ch - 'a']++;

            while (arr[ch - 'a'] > 1) {
                arr[s.charAt(left) - 'a']--;
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        System.out.println(maxCount);
    }
}