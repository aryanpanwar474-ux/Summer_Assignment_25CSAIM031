// Q77 - Multiply Matrices
// Companies: TCS, Infosys, Wipro

import java.util.Scanner;

public class Q77_MultiplyMatrices {
    public static void printMatrix(int[][] mat, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%6d", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of Matrix A (= rows of Matrix B): ");
        int c1 = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[c1][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter elements of Matrix A (" + r1 + "x" + c1 + "):");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B (" + c1 + "x" + c2 + "):");
        for (int i = 0; i < c1; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Multiply: C[i][j] = sum of A[i][k] * B[k][j]
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("\nMatrix A:");
        printMatrix(A, r1, c1);
        System.out.println("\nMatrix B:");
        printMatrix(B, c1, c2);
        System.out.println("\nProduct (A x B):");
        printMatrix(C, r1, c2);

        sc.close();
    }
}