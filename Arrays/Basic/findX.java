package Arrays.Basic;

import java.util.Scanner;

public class findX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == X) {
                System.out.println("X is found at index:" + i);
            }
        }
        sc.close();
    }
}
