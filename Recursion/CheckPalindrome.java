package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    // Function to check if a string is a palindrome using recursion
    static boolean isPalindrome(int i, char[] s, int n) {
        if (i >= n / 2) {
            return true; // Base condition: if we have checked up to the middle
        }
        if (s[i] != s[n - i - 1]) {
            return false; // If characters do not match
        }
        return isPalindrome(i + 1, s, n); // Recursive call with next index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String input = sc.nextLine();
        int n = input.length();
        char[] s = input.toCharArray();

        // Call the function to check if the string is a palindrome
        System.out.println(isPalindrome(0, s, n));
        sc.close();
    }
}
