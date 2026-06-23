import java.util.*;

public class Q64_RemoveDuplicates {
    static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Original : " + Arrays.toString(arr));
        System.out.println("Result   : " + Arrays.toString(removeDuplicates(arr)));
    }
}