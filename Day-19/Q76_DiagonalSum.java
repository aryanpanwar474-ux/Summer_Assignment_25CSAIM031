// Q76 - Find Diagonal Sum of a Square Matrix
// Companies: TCS, Infosys, Wipro

import java.util.Scanner;

public class Q76_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        int primarySum = 0;   // Top-left to bottom-right
        int secondarySum = 0; // Top-right to bottom-left

        for (int i = 0; i < n; i++) {
            primarySum += mat[i][i];
            secondarySum += mat[i][n - 1 - i];
        }

        // If n is odd, the center element is counted twice — subtract it once
        int totalSum = primarySum + secondarySum;
        if (n % 2 != 0) {
            totalSum -= mat[n / 2][n / 2];
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%5d", mat[i][j]);
            System.out.println();
        }

        System.out.println("\nPrimary Diagonal Sum   : " + primarySum);
        System.out.println("Secondary Diagonal Sum : " + secondarySum);
        System.out.println("Total Diagonal Sum     : " + totalSum);

        sc.close();
    }
}