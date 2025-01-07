package Hashing.basic;

import java.util.Scanner;

public class fst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize a hash array (adjust size based on problem constraints)
        int[] hash = new int[13]; // Adjust size based on the maximum expected value

        // Populate the hash array
        for (int i = 0; i < n; i++) {
            if (arr[i] < hash.length) {
                hash[arr[i]] += 1;
            }
        }

        // Read number of queries
        int q = sc.nextInt(); // Use int for the number of queries

        // Process and output each query
        while (q-- > 0) {
            int number = sc.nextInt();
            // Print the count for the queried number directly
            System.out.println(hash[number]);
        }

        sc.close(); // Always close the scanner
    }
}
