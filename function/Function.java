package function;

import java.util.Scanner;

public class Function {
    public static void printMyname(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyname(name);
        sc.close();
    }
}
