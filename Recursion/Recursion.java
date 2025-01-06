package Recursion;

import java.util.Scanner;

public class Recursion {

    static int fibonacci(int N) {
        // Base Condition.
        if (N <= 1) {
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N - 1);
        int slast = fibonacci(N - 2);

        return last + slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
        sc.close();
    }
}
