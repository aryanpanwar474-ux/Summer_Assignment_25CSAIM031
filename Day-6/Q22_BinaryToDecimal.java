// Q22 - Convert Binary to Decimal
// Multiply each bit by its positional power of 2 and sum
// Example: 1101 → 1×8 + 1×4 + 0×2 + 1×1 = 13

import java.util.Scanner;

public class Q22_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit != '0' && bit != '1') {
                System.out.println("Invalid binary number!");
                return;
            }
            decimal += (bit - '0') * Math.pow(2, power);
            power++;
        }

        System.out.println("Decimal of " + binary + " is: " + decimal);
        sc.close();
    }
}
