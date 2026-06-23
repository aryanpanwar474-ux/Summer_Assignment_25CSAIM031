import java.util.Arrays;

public class Q65_MergeArrays {
    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) merged[i] = arr1[i];
        for (int i = 0; i < arr2.length; i++) merged[arr1.length + i] = arr2[i];
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println("Array 1  : " + Arrays.toString(arr1));
        System.out.println("Array 2  : " + Arrays.toString(arr2));
        System.out.println("Merged   : " + Arrays.toString(mergeArrays(arr1, arr2)));
    }
}