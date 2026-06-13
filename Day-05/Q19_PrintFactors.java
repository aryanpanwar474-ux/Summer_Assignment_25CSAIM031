// Q19 - Print all Factors of a Number
// Factors are numbers that divide the given number exactly (remainder = 0)
// Example: Factors of 12 → 1, 2, 3, 4, 6, 12

import java.util.Scanner;

public class Q19_PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}