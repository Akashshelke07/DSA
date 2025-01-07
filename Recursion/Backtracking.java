package Recursion;

import java.util.Scanner;

/* Print linerly from 1 to N by Backtracking */
public class Backtracking {
    static void Function(int i, int n) {
        if (i < 1)
            return;
        Function(i - 1, n);
        System.out.println(i);/*
                               * by writing this statement at the last we can print it in the sequential
                               * manner
                               */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Function(n, n);
        sc.close();
    }
}
