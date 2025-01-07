package Patterns;

import java.util.Scanner;

public class TenthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print stars in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop through each row for the second half (decreasing order of stars)
        for (int i = n - 1; i >= 1; i--) {
            // Print stars in decreasing order
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
