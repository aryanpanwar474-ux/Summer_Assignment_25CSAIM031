// Q80 - Find Column-wise Sum of a Matrix
// Companies: TCS, Infosys, Wipro

import java.util.Scanner;

public class Q80_ColumnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.printf("%5d", mat[i][j]);
            System.out.println();
        }

        System.out.println("\nColumn-wise Sums:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++)
                sum += mat[i][j];
            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }

        sc.close();
    }
}