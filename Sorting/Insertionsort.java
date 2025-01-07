package Sorting;

import java.util.Scanner;

public class Insertionsort {
    static void Insertion_sort(int arr[], int n) {
        for (int i = 1; i <= n - 1; i++) {
            int j = 1;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Insertion_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }

}
