import java.util.*;
import java.io.*;

public class Solution {

    // Method to rotate the array by one position to the left
    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0]; // Store the first element
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; // Shift elements to the left
        }
        arr[n - 1] = temp; // Place the first element at the end
        return arr; // Return the rotated array
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate the array
        int[] rotatedArray = rotateArray(arr, n);

        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int element : rotatedArray) {
            System.out.print(element + " ");
        }

        sc.close(); // Close the scanner
    }
}
