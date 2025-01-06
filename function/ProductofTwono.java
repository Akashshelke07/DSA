package function;

import java.util.Scanner;

public class ProductofTwono {
    public static int ProductofNo(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of two no is:" + ProductofNo(a, b));
        sc.close();
    }
}
