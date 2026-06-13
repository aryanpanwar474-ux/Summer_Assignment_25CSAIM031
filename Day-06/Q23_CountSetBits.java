// Q23 - Count Set Bits in a Number
// Set bits = number of 1s in binary representation
// Method: Brian Kernighan's Algorithm — n & (n-1) clears the lowest set bit each time
// Example: 13 = 1101 → 3 set bits

import java.util.Scanner;

public class Q23_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        while (temp > 0) {
            temp = temp & (temp - 1); // clears the lowest set bit
            count++;
        }

        // Show binary for clarity
        System.out.println("Binary of " + n + " is: " + Integer.toBinaryString(n));
        System.out.println("Number of set bits (1s): " + count);
        sc.close();
    }
}