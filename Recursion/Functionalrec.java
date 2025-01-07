package Recursion;

/*Functional recursion is a type of recursion where the function returns a value and the recursive call is part of an expression that computes the final result. */
import java.util.Scanner;

public class Functionalrec {
    static int Rec(int n) {
        if (n == 0)
            return 0;
        return n + Rec(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Rec(n));
        sc.close();
    }
}
