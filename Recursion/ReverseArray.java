package Recursion;

import java.util.Scanner;

public class ReverseArray {

    // Function to reverse the array using recursion
    static void reverseArray(int i, int[] arr, int n) {
        if (i >= n / 2) {
            return; // Base condition: stop when reaching the middle of the array
        }

        // Swap elements directly within the recursive function
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseArray(i + 1, arr, n); // Recursive call with next index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to reverse the array
        reverseArray(0, arr, n);

        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            sc.close();
        }
    }
}
