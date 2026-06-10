// Q27 - Recursive Sum of Digits
// sumDigits(n) = (n % 10) + sumDigits(n / 10), base case: n == 0
// Example: 1234 → 1+2+3+4 = 10

import java.util.Scanner;

public class Q27_RecursiveSumOfDigits {

    static int sumOfDigits(int n) {
        if (n == 0) return 0;                          // base case
        return (n % 10) + sumOfDigits(n / 10);         // last digit + recurse on rest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumOfDigits(Math.abs(n));
        System.out.println("Sum of digits of " + n + " = " + result);
        sc.close();
    }
}
