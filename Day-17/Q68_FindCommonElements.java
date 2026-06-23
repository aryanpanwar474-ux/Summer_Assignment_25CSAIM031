import java.util.*;

public class Q68_FindCommonElements {
    static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) set1.add(num);
        for (int num : arr2) set2.add(num);
        for (int num : arr3) {
            if (set1.contains(num) && set2.contains(num)) {
                result.add(num);
                set1.remove(num); // avoid duplicates
                set2.remove(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 7};
        int[] arr3 = {3, 5, 8, 9};
        System.out.println("Array 1         : " + Arrays.toString(arr1));
        System.out.println("Array 2         : " + Arrays.toString(arr2));
        System.out.println("Array 3         : " + Arrays.toString(arr3));
        System.out.println("Common Elements : " + findCommonElements(arr1, arr2, arr3));
    }
}