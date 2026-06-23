import java.util.Arrays;

public class Q61_FindMissingNumber {
    static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3, N=6
        int n = 6;
        System.out.println("Array          : " + Arrays.toString(arr));
        System.out.println("Missing Number : " + findMissingNumber(arr, n));
    }
}
