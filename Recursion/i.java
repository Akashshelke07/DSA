package Recursion;

import java.util.Scanner;

/* Print linerly from 1 to N */
public class i {
    static void liner(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        liner(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        liner(1, n);
        sc.close();
        
    }
}
