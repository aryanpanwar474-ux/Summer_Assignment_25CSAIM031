// Q24 - Find x^n Without Using pow()
// Use fast exponentiation (Binary Exponentiation) — O(log n)
// Idea: x^n = (x^2)^(n/2) if n is even, or x * x^(n-1) if n is odd
// Example: 2^10 = 4^5 = 4 * 16^2 = 4 * 256 = 1024

import java.util.Scanner;

public class Q24_PowerWithoutPow {

    static long power(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {       // if exponent is odd
                result *= base;
            }
            base *= base;             // square the base
            exp /= 2;                 // halve the exponent
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        long x = sc.nextLong();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("This program handles non-negative exponents only.");
            return;
        }

        long result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);
        sc.close();
    }
}
