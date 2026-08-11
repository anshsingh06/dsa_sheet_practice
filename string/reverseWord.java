package string;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
    
}
