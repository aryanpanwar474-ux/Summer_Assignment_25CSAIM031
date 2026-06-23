// Q72 - Sort Array in Descending Order
// Companies: Amazon, Deloitte, Capgemini

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q72_SortDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n]; // Use Integer (wrapper) for Collections.sort
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        // Sort in descending order using reverse comparator
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("After Sorting (Descending): " + Arrays.toString(arr));
        sc.close();
    }
}