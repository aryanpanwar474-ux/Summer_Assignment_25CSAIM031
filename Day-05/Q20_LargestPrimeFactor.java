// Q20 - Find Largest Prime Factor of a Number
// Example: Largest prime factor of 360 → 5 (360 = 2^3 × 3^2 × 5)

import java.util.Scanner;

public class Q20_LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long largest = -1;
        long temp = n;

        // Divide out all 2s
        while (temp % 2 == 0) {
            largest = 2;
            temp /= 2;
        }

        // Check odd factors from 3 onwards
        for (long i = 3; i <= Math.sqrt(temp); i += 2) {
            while (temp % i == 0) {
                largest = i;
                temp /= i;
            }
        }

        // If remaining temp > 1, it's a prime factor itself
        if (temp > 1) {
            largest = temp;
        }

        System.out.println("Largest Prime Factor of " + n + " is: " + largest);

        sc.close();
    }
}