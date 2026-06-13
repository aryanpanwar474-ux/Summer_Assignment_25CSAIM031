// Q30 - Print Number Triangle
// Row 1 → 1, Row 2 → 12, Row 3 → 123, ...
// Example (n=5):
// 1
// 12
// 123
// 1234
// 12345

import java.util.Scanner;

public class Q30_NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nNumber Triangle:");
        for (int i = 1; i <= n; i++) {            // loop through each row
            for (int j = 1; j <= i; j++) {         // print numbers 1 to row number
                System.out.print(j);
            }
            System.out.println();                   // move to next line
        }

        sc.close();
    }
}