// Q75 - Transpose Matrix
// Companies: TCS, Infosys, Wipro

import java.util.Scanner;

public class Q75_TransposeMatrix {
    public static void printMatrix(int[][] mat, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%5d", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] T = new int[cols][rows]; // Transposed matrix has swapped dimensions

        System.out.println("Enter elements of Matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        // Transpose: T[j][i] = A[i][j]
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                T[j][i] = A[i][j];

        System.out.println("\nOriginal Matrix (" + rows + "x" + cols + "):");
        printMatrix(A, rows, cols);
        System.out.println("\nTransposed Matrix (" + cols + "x" + rows + "):");
        printMatrix(T, cols, rows);

        sc.close();
    }
}