import java.util.Arrays;

public class Q58_RotateArrayLeft {
    static void rotateLeft(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original     : " + Arrays.toString(arr));
        rotateLeft(arr);
        System.out.println("Rotated Left : " + Arrays.toString(arr));
    }
}