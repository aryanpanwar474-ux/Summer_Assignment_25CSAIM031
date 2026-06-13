// Q29 - Print Half Pyramid Pattern using Stars
// Row 1 → 1 star, Row 2 → 2 stars, ..., Row n → n stars
// Example (n=5):
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class Q29_HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nHalf Pyramid Pattern:");
        for (int i = 1; i <= n; i++) {           // loop through each row
            for (int j = 1; j <= i; j++) {        // print stars equal to row number
                System.out.print("* ");
            }
            System.out.println();                  // move to next line
        }

        sc.close();
    }
}
