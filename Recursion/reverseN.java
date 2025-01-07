package Recursion;

import java.util.Scanner;

public class reverseN {
    static void Function(int i, int n) {
        if (i < 1)
            return;
        System.out.println(i);
        Function(i - 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Function(n, n);
        sc.close();
    }
}
