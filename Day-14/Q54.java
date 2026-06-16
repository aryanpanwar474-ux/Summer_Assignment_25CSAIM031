import java.util.Scanner;

public class Q54 {
    static int frequency(int[] arr, int key) {
        int count = 0;
        for (int x : arr)
            if (x == key) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        System.out.println("Frequency of " + key + " = " + frequency(arr, key));
    }
}