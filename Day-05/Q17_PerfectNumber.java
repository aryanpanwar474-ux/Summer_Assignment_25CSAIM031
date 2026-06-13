// Q17 - Check Perfect Number
// A perfect number equals the sum of its proper divisors (excluding itself)
// Example: 6 = 1 + 2 + 3 → Perfect!

import java.util.Scanner;

public class Q17_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is NOT a Perfect Number.");
        }

        sc.close();
    }
}