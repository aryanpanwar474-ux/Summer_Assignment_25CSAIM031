// Q26 - Recursive Fibonacci
// fib(n) = fib(n-1) + fib(n-2), base cases: fib(0)=0, fib(1)=1
// Example: First 8 terms → 0 1 1 2 3 5 8 13

import java.util.Scanner;

public class Q26_RecursiveFibonacci {

    static int fibonacci(int n) {
        if (n == 0) return 0;                         // base case 1
        if (n == 1) return 1;                         // base case 2
        return fibonacci(n - 1) + fibonacci(n - 2);   // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
