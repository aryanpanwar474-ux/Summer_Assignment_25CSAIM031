// Q32 - Print Repeated Number Pattern
// Row 1 → 1, Row 2 → 22, Row 3 → 333, ...
// Each row number is repeated as many times as the row number itself
// Example (n=5):
// 1
// 22
// 333
// 4444
// 55555

import java.util.Scanner;

public class Q32_RepeatedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nRepeated Number Pattern:");
        for (int i = 1; i <= n; i++) {      // loop through each row
            for (int j = 1; j <= i; j++) {   // repeat row number i times
                System.out.print(i);
            }
            System.out.println();            // move to next line
        }

        sc.close();
    }
}
