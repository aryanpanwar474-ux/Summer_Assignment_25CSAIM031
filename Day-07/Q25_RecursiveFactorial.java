// Q25 - Recursive Factorial
// factorial(n) = n * factorial(n-1), base case: factorial(0) = 1
// Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

import java.util.Scanner;

public class Q25_RecursiveFactorial {

    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;      // base case
        return n * factorial(n - 1);          // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println(n + "! = " + factorial(n));
        }
        sc.close();
    }
}
