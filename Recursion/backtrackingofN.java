package Recursion;

import java.util.Scanner;

public class backtrackingofN {
    static void Function(int i, int n) {
        if (i > n)
            return;
        Function(i + 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Function(1, n);
        sc.close();
    }
}
