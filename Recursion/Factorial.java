package Recursion;

import java.util.Scanner;

public class Factorial {
    static int fac(int n) {
        if (n == 0)
            return 1; /* Because of this return 1 the factorial function is working */
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
        sc.close();
    }
}
