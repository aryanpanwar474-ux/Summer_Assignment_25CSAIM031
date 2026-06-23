import java.util.*;

public class Q66_UnionOfArrays {
    static int[] unionOfArrays(int[] arr1, int[] arr2) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
        System.out.println("Union   : " + Arrays.toString(unionOfArrays(arr1, arr2)));
    }
}