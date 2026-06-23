import java.util.Arrays;

public class Q60_MoveZeroesToEnd {
    static void moveZeroesToEnd(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }
        while (pos < arr.length) {
            arr[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Original : " + Arrays.toString(arr));
        moveZeroesToEnd(arr);
        System.out.println("Result   : " + Arrays.toString(arr));
    }
}