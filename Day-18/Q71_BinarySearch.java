// Q71 - Binary Search
// Companies: Amazon, Deloitte, Capgemini

import java.util.Arrays;
import java.util.Scanner;

public class Q71_BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (in sorted order):");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Sort array first to ensure binary search works correctly
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element " + target + " found at index " + result);
        else
            System.out.println("Element " + target + " not found in the array.");

        sc.close();
    }
}