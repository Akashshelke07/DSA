package Insertion;


import java.io.*;

public class TestClass {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine().trim());
        int out = Consistent(N);
        System.out.println(out);

        wr.close();
        br.close();
    }

    static int Consistent(int N) {
        return (modularExponentiation(2, N, MOD) - 1 + MOD) % MOD;
    }

    // Function to calculate (base^exp) % mod using fast exponentiation
    static int modularExponentiation(int base, int exp, int mod) {
        long result = 1;
        long power = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1) { // If exp is odd, multiply power with result
                result = (result * power) % mod;
            }
            power = (power * power) % mod; // Square the base
            exp >>= 1; // Divide exp by 2
        }

        return (int) result;
    }
}