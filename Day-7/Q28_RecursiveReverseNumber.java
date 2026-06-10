// Q28 - Recursive Reverse Number
// Build reversed number by extracting last digit and shifting
// Example: 1234 → 4321

import java.util.Scanner;

public class Q28_RecursiveReverseNumber {

    // accumulator holds the reversed number being built
    static int reverse(int n, int accumulator) {
        if (n == 0) return accumulator;                          // base case
        return reverse(n / 10, accumulator * 10 + (n % 10));    // shift and append digit
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = reverse(Math.abs(n), 0);
        if (n < 0) reversed = -reversed;

        System.out.println("Reverse of " + n + " = " + reversed);
        sc.close();
    }
}
