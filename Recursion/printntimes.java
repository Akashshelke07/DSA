package Recursion;

/* Print Name N times using recursion */
import java.util.Scanner;

public class printntimes {
    public static void printNO(int i, int n) {
        if (i > n)
            return;
        System.out.println("Akash");
        printNO(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNO(1, n);
        sc.close();
    }
}
