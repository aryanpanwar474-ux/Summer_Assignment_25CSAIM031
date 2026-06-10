// Q31 - Print Character Triangle
// Row 1 → A, Row 2 → AB, Row 3 → ABC, ...
// Example (n=5):
// A
// AB
// ABC
// ABCD
// ABCDE

import java.util.Scanner;

public class Q31_CharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nCharacter Triangle:");
        for (int i = 1; i <= n; i++) {              // loop through each row
            for (int j = 0; j < i; j++) {            // print chars from A up to current row
                System.out.print((char) ('A' + j));  // 'A' + 0 = A, 'A' + 1 = B, etc.
            }
            System.out.println();                    // move to next line
        }

        sc.close();
    }
}
