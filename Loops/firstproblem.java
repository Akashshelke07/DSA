package Loops;
/* Print the sum of first n natural numbers. */

// public class firstproblem {
//     public static void main(String[] args) {
//         int n = 4;
//         int sum = 0;
//         for(int i = 1; i <=n; i++){
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }

import java.util.Scanner;

public class firstproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }

}