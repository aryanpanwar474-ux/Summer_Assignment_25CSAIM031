// Q21 - Convert Decimal to Binary
// Repeatedly divide by 2 and collect remainders in reverse
// Example: 13 → 1101

import java.util.Scanner;

public class Q21_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binary of 0 is: 0");
            return;
        }

        String binary = "";
        int temp = Math.abs(n);

        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp /= 2;
        }

        if (n < 0) binary = "-" + binary;

        System.out.println("Binary of " + n + " is: " + binary);
        sc.close();
    }
}