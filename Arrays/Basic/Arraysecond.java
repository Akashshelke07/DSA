package Arrays.Basic;

import java.util.Scanner;

public class Arraysecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
        /*
         * if we dont declear this so the memory will save the index value as null value
         */
        // Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
