// Q78 - Check Symmetric Matrix
// A matrix is symmetric if it equals its transpose (A[i][j] == A[j][i])
// Companies: TCS, Infosys, Wipro

import java.util.Scanner;

public class Q78_SymmetricMatrix {
    public static boolean isSymmetric(int[][] mat, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] != mat[j][i])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%5d", mat[i][j]);
            System.out.println();
        }

        if (isSymmetric(mat, n))
            System.out.println("\nThe matrix is Symmetric.");
        else
            System.out.println("\nThe matrix is NOT Symmetric.");

        sc.close();
    }
}