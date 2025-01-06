package Recursion;

import java.util.Scanner;

/*parameterized recursive function because it uses the parameter sum to accumulate the result during the recursion. */
public class parame {
    static void FunctionNO(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        FunctionNO(i - 1, sum + i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FunctionNO(n, 0);
        sc.close();
    }

}